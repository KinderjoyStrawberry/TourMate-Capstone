from model import Data
from flask import Flask, jsonify, make_response, request
from flask_restful import Api

app = Flask(__name__)
api = Api(app)

@app.route('/')
def hello():

    return 'Hello World !'


@app.route('/wisata', methods=['GET'])
def get():

    dt = Data()
    values = ()

    id_ = request.args.get("Place_Id")
    if id_:
        query = "SELECT * FROM tourist where Place_Id = %s"
        values = (id_,)
    else:
        query = "SELECT * FROM tourist"
    data = dt.get_data(query, values)

    return make_response(jsonify({'data': data}), 200)


@app.route('/rekomendasi', methods=['GET'])
def rating():

    dt = Data()
    values = ()
    query = "SELECT * FROM tourist ORDER BY Rating DESC LIMIT 10"
    data = dt.get_data(query, values)

    return make_response(jsonify({'data': data}), 200)




if __name__ == '__main__':
    app.run(debug=True)