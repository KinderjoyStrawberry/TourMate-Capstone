# MACHINE LEARNING TOURMATE
Machine learning in this project is to create a tourism recommendation feature based on user preferences by building a machine learning model using TensorFlow. 

## Dataset
Build tourism dataset with +100 data tourism attraction in Bali. The data set was obtained by scraping from Google Maps and the web. The dataset has 13 columns: 
- 'Place_Id' type int64
- 'Place_Name' type object
- 'Description' type object
- 'Category' type object
- 'City' type object
- 'Price'  type int64
- 'Rating' type float64
- 'Time_Minutes' type object
- 'Coordinate' type object
- 'Lat' type float64
- 'Long' type float64
- 'Maps' type object
- 'Images'. type object

## Preprocessing
 - Stop word removal using Sastrawi
 - TF-IDF using Tensorflow

## Modeling
Simple KNN model with matrix cosine similarity and k value = 4.

## Evaluate
Similarity score

## Model Saving 
Pickle
