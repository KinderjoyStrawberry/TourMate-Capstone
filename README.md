# CLOUD COMPUTING TOURMATE
  
Creating **RESTful APIs** and deploying to [Google Cloud Platform](https://cloud.google.com) by using [Google App Engine](https://cloud.google.com/appengine) for communication between **Machine Learning Models** and **Mobile Development**. Creating database in [Cloud SQL](https://cloud.google.com/sql) to store the data of destination.

# RESTful API

In order to make the **RESTful APIs** we use [Python](https://github.com/python) programming language and using the [Flask Framework](https://flask.palletsprojects.com/en/2.0.x/) for the project, and using **JSON** format to get the data. For each URL that can be used will be explained below.

## all tourist place

In this section there is a list of all tourist place that ordered by place ID. Response from URL using **JSON** format.

** Base URL : **
- https://diesel-channel-351512.uc.r.appspot.com/

** endpoint **
- "/wisata" [with method GET]
- https://diesel-channel-351512.uc.r.appspot.com/wisata
```json
{
            "Category": "Alam",
            "City": "Badung",
            "Cordinate": "{'lat': -8.4905859, 'lng': 115.2398071}",
            "Description": "Bali swing di desa Bongkasa adalah sebuah rekreasi atau wisata petualangan baru yang ada di Bali. Swing atau ayunan ini cukup diminati bagi mereka yang ingin merasakan sebuah tantangan dan uji nyali. Memang menikmati berbagai tantangan termasuk juga pesona alam indah pulau Dewata Bali, tentunya sudah sering dimanjakan dengan keindahan alam pantai termasuk juga sejuknya alam pegunungan, danau dan juga air terjun yang ada di pulau ini.",
            "Lat": "-8.4905859",
            "Long": "115.2398071",
            "Maps": "https://www.google.com/maps/place/Bali+Swing/@-8.4905806,115.2376184,17z/data=!3m1!4b1!4m5!3m4!1s0x2dd23d2bb78f98e5:0xdc87cb5e74348952!8m2!3d 8.4905859!4d115.2398071",
            "Place_Id": 1,
            "Place_Name": "Bali Swing",
            "Price": 98000,
            "Rating": "4.5",
            "Time_Minutes": null,
            "img_url": "https://images.unsplash.com/photo-1554481924-0eecea3f21de?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=870&q=80"
        }
```
<br>

## Show Tourist Place Recommendation
In this section **RESTful APIs** is used to connect data models that have been created by the **Machine Learning** team into data that can be consumed by **Mobile Development** to provide tourist place recommendations to users. Response from URL using **JSON** format.

** Endpoint **
- "/rekomendasi" [with method GET]
- https://diesel-channel-351512.uc.r.appspot.com/rekomendasi

```json
{
            "Category": "Alam",
            "City": "Klungkung",
            "Cordinate": "{'lat': -8.7503812, 'lng': 115.4704331}",
            "Description": "Kelingking Beach adalah salah satu spot Nusa Penida yang paling terkenal. Situs perjalanan besar menggunakan fotonya untuk mengiklankan Bali dan bahkan terkadang Indonesia. Tempatnya memang sangat spektakuler dan sungguh menakjubkan. Batuan Pantai Kelingking terlihat seperti tulang punggung dinosaurus yang akan minum di laut.",
            "Lat": "-8.7503812",
            "Long": "115.4704331",
            "Maps": "https://www.google.com/maps/place/Kelingking+Beach+Nusa+Penida/@-8.7503812,115.4704331,17z/data=!3m1!4b1!4m5!3m4!1s0x2dd26f1616cd2cc7:0xee84b7df0afbff19!8m2!3d-8.7503865!4d115.4726218",
            "Place_Id": 2,
            "Place_Name": "Pantai Kelingking",
            "Price": 5000,
            "Rating": "4.9",
            "Time_Minutes": null,
            "img_url": "https://images.unsplash.com/photo-1570811433296-87c8f5118244?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=874&q=80"
        },
        {
            "Category": "Alam",
            "City": "Buleleng",
            "Cordinate": "{'lat': -8.217182, 'lng': 115.0994924}",
            "Description": "Air Terjun Banyumala adalah air terjun yang indah dan memiliki 3 formasi jatuhan air. Yang terbesar berada di tengah. Yang lebih kecil berada di sebelah kiri dan kanannya. Sebuah kolam alami berada di bawahnya.",
            "Lat": "-8.2171820",
            "Long": "115.0994924",
            "Maps": "https://www.google.com/maps/place/Banyumala+Twin+Waterfalls/@-8.217182,115.0994924,17z/data=!3m1!4b1!4m5!3m4!1s0x2dd18f9d7a04e875:0x4eccd9e08e4d2397!8m2!3d-8.2171873!4d115.1016811?authuser=0&hl=en",
            "Place_Id": 18,
            "Place_Name": "Banyumala Twin Waterfalls",
            "Price": 10000,
            "Rating": "4.8",
            "Time_Minutes": null,
            "img_url": "https://live.staticflickr.com/4426/36439338474_a98d6c0ffc_k.jpg"
        },
        {
            "Category": "Budaya",
            "City": "Bangli",
            "Cordinate": "{'lat': -8.4222473, 'lng': 115.359306}",
            "Description": "Desa Penglipuran adalah salah satu desa adat yang terletak di Kabupaten Bangli , Provinsi Bali , Indonesia . Desa Penglipuran terkenal sebagai salah satu tujuan wisata di Bali karena masyarakatnya yang masih melestarikan budaya tradisional mereka dalam kehidupan sehari-hari. Arsitektur bangunan dan pengolahan lahan masih mengikuti konsep Tri Hita Karana, falsafah masyarakat Bali tentang keseimbangan hubungan antara Tuhan, manusia dan lingkungannya. Desa Penglipuran berhasil membangun pariwisata yang bermanfaat bagi seluruh masyarakatnya tanpa kehilangan budaya dan tradisinya. Pada tahun 1995, Desa Penglipuran juga menerima penghargaan Kalpataru dari Pemerintah Indonesia atas upayanya menjaga Hutan Bambu di ekosistem lokalnya.",
            "Lat": "-8.4222473",
            "Long": "115.3593060",
            "Maps": "https://www.google.com/maps/place/Penglipuran+Village/data=!4m6!3m5!1s0x2dd2196eace4f4a9:0x3319169adf0c3419!8m2!3d-8.4222473!4d115.359306!16s%2Fg%2F11g6htx9w5?authuser=0&hl=en&rclk=1",
            "Place_Id": 45,
            "Place_Name": "Desa Penglipuran",
            "Price": 25000,
            "Rating": "4.8",
            "Time_Minutes": null,
            "img_url": "https://live.staticflickr.com/5071/5847571838_82c62658cd_k.jpg"
        }
```
<br>


