package com.glantrox.dicoding_beginner_hamas.database

import com.glantrox.dicoding_beginner_hamas.dataclass.RecipeModel

class StaticData {

     fun Recipes(): List<RecipeModel> {
        return listOf(
            RecipeModel(
                "Resep Rendang Daging Sapi",
                "Resep rendang daging sapi hari ini didedikasikan untuk para ibu-ibu Minang yang memasak rendang dan bumbu rendang daging sapi dengan kesabaran dan hanya berbekal kayu bakar. Maka, sudah waktunya yang muda-muda ini untuk melestarikan warisan kuliner yang satu ini. Bahkan mencontoh beberapa penggiat kuliner, ada juga yang memang sengaja ke Sumatra Barat untuk mendokumentasikan rendang menjadi sebuah buku.",
                "https://www.masakapahariini.com/wp-content/uploads/2022/07/resep-rendang-daging-sapi-featured-780x440.jpg",
                listOf(
                    "600g daging sapi bagian sengkel, potong kotak 5 cm",
                    "3 lembar daun jeruk",
                    "2 batang serai, memarkan",
                    "1 lembar daun kunyit",
                    "5sdt pala bubuk",
                    "5sdt pala bubuk",
                    "2.5L air",
                    "130ml santan instan",
                    "1sdm royco kaldu sapi",
                    "2.5sdm garam",
                    "5sdm minyak, untuk menumis",
                    "120g cabai merah keriting",
                    "15 butir bawang merah",
                    "10 siung bawang putih",
                    "3cm lengkuas",
                    "2cm kunyit",
                    "1cm jahe",
                ),
                "Rian Farisa"
            ),
            RecipeModel(
                "Resep Nasi Goreng Spesial",
                "Nasi goreng adalah salah satu hidangan khas Indonesia yang populer. Nikmati nasi goreng spesial dengan bumbu dan rempah pilihan.",
                "https://cdn1-production-images-kly.akamaized.net/j4KFsV4Pl08lGnhCED4Gm0LR3kE=/0x148:1920x1230/1200x675/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/3093328/original/069244600_1585909700-fried-2509089_1920.jpg",
                listOf(
                    "3 piring nasi dingin",
                    "2 butir telur, kocok lepas",
                    "100g daging ayam, potong dadu kecil",
                    "100g udang, kupas kulitnya",
                    "2 siung bawang putih, cincang halus",
                    "1 buah cabai merah besar, iris tipis",
                    "1 batang daun bawang, iris tipis",
                    "1 sendok makan kecap manis",
                    "1 sendok teh saus tiram",
                    "Garam secukupnya",
                    "Merica secukupnya",
                    "Minyak goreng secukupnya"
                ),
                "Rita Wijaya"
            ),
            RecipeModel(
                "Resep Soto Ayam",
                "Soto ayam adalah hidangan sup ayam dengan rempah-rempah yang kaya. Nikmati soto ayam hangat dengan pelengkap seperti koya dan jeruk nipis.",
                "https://ik.imagekit.io/dcjlghyytp1/2020/06/yusrisalaprianti.jpg?tr=f-auto",
                listOf(
                    "1 ekor ayam, potong menjadi beberapa bagian",
                    "2 liter air",
                    "3 lembar daun salam",
                    "2 batang serai, memarkan",
                    "3 cm jahe, memarkan",
                    "3 siung bawang putih, haluskan",
                    "2 sendok teh garam",
                    "1 sendok teh merica bubuk",
                    "1 sendok makan minyak goreng",
                    "100 gram tauge, seduh dengan air panas",
                    "4 butir telur, rebus dan iris menjadi dua bagian",
                    "Bawang merah goreng, sejumput",
                    "Daun seledri, cincang halus",
                    "Jeruk nipis, iris tipis"
                ),
                "Siti Maryam"
            ),
            RecipeModel(
                "Resep Mie Goreng",
                "Mie goreng adalah hidangan mie yang digoreng dengan bumbu dan tambahan bahan lainnya. Rasakan kelezatan mie goreng yang gurih dan pedas.",
                "https://www.masakapahariini.com/wp-content/uploads/2022/10/resep-mie-kari-goreng.jpg",
                listOf(
                    "200 gram mie telur",
                    "2 siung bawang putih, cincang halus",
                    "2 sendok makan kecap manis",
                    "1 sendok makan saus tiram",
                    "1 sendok makan minyak wijen",
                    "1 sendok teh garam",
                    "1/2 sendok teh merica bubuk",
                    "100 gram daging ayam, potong dadu",
                    "50 gram udang, kupas kulitnya",
                    "1 butir telur, kocok lepas",
                    "2 batang daun bawang, iris tipis",
                    "Minyak goreng secukupnya"
                ),
                "Budi Santoso"
            ),
            RecipeModel(
                "Resep Sushi",
                "Sushi adalah hidangan Jepang yang terdiri dari nasi yang dibentuk menjadi gulungan dengan berbagai bahan isi seperti ikan, sayuran, atau telur. Nikmati sushi yang segar dan lezat sebagai hidangan utama atau makanan ringan.",
                "https://lh5.googleusercontent.com/5VQaj4zWVnrACbuTcDr1UchSGwvtTAkaVUaF22sGnjpOtXgYtCRqKQ1PT6s754M4Z8bAVx6PFN4UlYBVfTQaDt9w2VkCrz-qt_01XLaMctLay4rOz7Q96LsWAsFNnOEQP2xTs6fy5bL9BShS6RjIWDwntHBqrggpFIu9Wj5C1I-pNoNdw0J4pJnSKWA",
                listOf(
                    "250 gram nasi sushi",
                    "150 gram ikan tuna segar, iris tipis",
                    "1 buah mentimun, iris panjang",
                    "2 lembar rumput laut nori",
                    "Wasabi secukupnya",
                    "Kecap asin secukupnya",
                    "Saus kedelai secukupnya"
                ),
                "Kenji Tanaka"
            ),
            RecipeModel(
                "Resep Pancake",
                "Pancake adalah hidangan sarapan yang terbuat dari adonan tepung yang digoreng hingga berwarna kecokelatan. Sajikan pancake dengan sirup maple, madu, atau berbagai topping kesukaan Anda.",
                "https://bakeitwithlove.com/wp-content/uploads/2022/06/fluffy-pancakes-sq-500x500.jpg",
                listOf(
                    "1 1/2 cup tepung terigu",
                    "3 sendok makan gula pasir",
                    "1 sendok teh baking powder",
                    "1/2 sendok teh garam",
                    "1 cup susu",
                    "1 butir telur",
                    "2 sendok makan mentega, lelehkan",
                    "Topping sesuai selera (misalnya, madu, blueberry, atau cokelat serut)"
                ),
                "Lisa Johnson"
            ),
            RecipeModel(
                "Resep Nasi Uduk",
                "Nasi uduk adalah hidangan nasi yang dimasak dengan santan dan rempah-rempah yang aromatik. Sajikan nasi uduk dengan lauk-pauk favorit Anda untuk hidangan yang lezat dan kaya cita rasa.",
                "https://kbu-cdn.com/dk/wp-content/uploads/nasi-uduk-kobe.jpg",
                listOf(
                    "2 cup beras",
                    "400 ml santan",
                    "2 lembar daun pandan",
                    "1 batang serai, memarkan",
                    "2 cm lengkuas, memarkan",
                    "1 sendok teh garam",
                    "1 sendok teh gula",
                    "2 lembar daun salam",
                    "2 butir telur, rebus dan iris menjadi dua",
                    "Bawang merah goreng, sejumput",
                    "Ikan teri goreng, sejumput"
                ),
                "Hendra Wijaya"
            ),
            RecipeModel(
                "Resep Puding Cokelat",
                "Puding cokelat adalah hidangan penutup yang lezat dan menggoda. Sajikan puding cokelat yang lembut dan kenyal untuk memuaskan keinginan manis Anda.",
                "https://hips.hearstapps.com/thepioneerwoman/wp-content/uploads/2016/04/how-to-make-chocolate-pudding-00a.jpg?crop=1xw:0.8426966292134831xh;center,top&resize=1200:*",
                listOf(
                    "2 sachet agar-agar cokelat",
                    "500 ml susu cair",
                    "3 sendok makan cokelat bubuk",
                    "5 sendok makan gula pasir",
                    "1 sendok teh vanila essence",
                    "100 gram meses cokelat, untuk taburan"
                ),
                "Rani Putri"
            ),
            RecipeModel(
                "Resep Gado-Gado",
                "Gado-gado adalah hidangan salad sayur dengan saus kacang yang lezat. Sajikan gado-gado segar dan sehat sebagai menu utama atau pelengkap.",
                "https://i0.wp.com/resepkoki.id/wp-content/uploads/2017/02/Resep-Gado-Gado.jpg?fit=1920%2C1840&ssl=1",
                listOf(
                    "200 gram tahu, potong dadu dan goreng",
                    "200 gram tempe, potong dadu dan goreng",
                    "150 gram kacang panjang, potong-potong dan rebus",
                    "100 gram taoge, rebus sebentar",
                    "1 buah mentimun, iris tipis",
                    "2 buah kentang, rebus dan potong-potong",
                    "2 lembar daun selada, sobek-sobek",
                    "2 lembar daun ketimun, sobek-sobek",
                    "2 butir telur, rebus dan belah menjadi dua",
                    "Bawang goreng, sejumput",
                    "Kerupuk, secukupnya"
                ),
                "Hamas Azizan"
            ),RecipeModel(
                "Hainan Chicken Rice",
                "Hainan Chicken Rice adalah hidangan khas Tiongkok yang terdiri dari nasi yang dimasak dengan kaldu ayam, disajikan dengan potongan ayam lembut, dan disertai dengan saus bawang dan saus cabai.",
                "https://www.seriouseats.com/thmb/OVPH7U5DQfboRHeAJ-8VH4DBGBQ=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/hainanese-chicken-rice-set-recipe-hero-Fred-Hardy-d04b51b0338144dc8549c89802b721e4.JPG",
                listOf(
                    "1 ekor ayam utuh, kulit dipotong",
                    "4 gelas air",
                    "2 sendok teh garam",
                    "2 sendok teh minyak wijen",
                    "2 cm jahe, memarkan",
                    "4 gelas nasi",
                    "2 siung bawang putih, cincang halus",
                    "1 sendok teh minyak wijen",
                    "Daun seledri, cincang halus",
                    "Kecap manis secukupnya",
                    "Saus cabai secukupnya"
                ),
                "Antonnio Kenway"
            )

        )
    }

}