<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ALUMNUS</title>

    <!-- Bootstrap 5 CSS file -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
        integrity="sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ=="
        crossorigin="anonymous" referrerpolicy="no-referrer" />

    <!--Swippers CSS-->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/swiper@8/swiper-bundle.min.css" />



    <!-- Font Awesome -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" rel="stylesheet" />
    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap" rel="stylesheet" />
    <!-- MDB -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/5.0.0/mdb.min.css" rel="stylesheet" />

    <!-- CUSTOM CSS -->
    <link rel="stylesheet" href="style.css">
    <!-- CUSTOM CSS END -->



</head>


<body class="main">

    <%
            String username = (String)session.getAttribute("username");
            System.out.println(username);
            if(username==null)
            {
                response.sendRedirect("login.html");
            }
        %>
    <header class="top ">

        <div class="container ">
            <div class="row">
                <div class="col-md-2 logo">
                    <h1 id="logo">ALUMNUS</h1>
                </div>
                <div class="col-md-8 ">

                </div>

                <div class="col-md-2 sign">
                    <!--<a href="sign.html"><button>signIn</button></a>-->
                    <!--<a href="login.html"><button>login</button></a>-->
                    <button class="login-button"> <a href="logout.jsp">logout</a> </button>
                </div>
              


            </div>
        </div>


    </header>


    <div class="header-wrapper">

        <div class="container header-container">



            <div class="row">


                <div class="col-md-2"></div>



                <div class="col-md-8 nav-item">
                    <li><a href="index.jsp" class="active">Home</a></li>
                    <li><a href="#">Students</a></li>
                    <li><a href="home.jsp">Alumni</a></li>
                    <li><a href="#">Careers</a></li>
                    <li><a href="#">Events & Notice</a></li>
                    <li><a href="contact.html">Contact us</a></li>
                    <li><a href="#about-us">About us</a></li>

                </div>



                <div class="col-md-2 nav-search
                ">
                    <input type="text" name="search" id="search" placeholder="search">
                </div>





            </div>
        </div>

    </div>
    <!-- navbar end -->


    <!--Hero Section Start-->

    <section class="hero">
        <div class="hero-img">
            <img id="img1" src="image/background_image.png" alt="">
            <div class="center">WELCOME TO INDORE INSTITUTE ALUMNI PORTAL</div>

            <div class="center-next">Connect back with your Batchmate and INSTITUTE</div>

        </div>
    </section>
    <!--Hero Section End-->

    <div id="strip"></div>

    <!-- alumni connection -->

    <div class="connection-section">
        <h1>Connect with your Alumni</h1>
        <div class="container connection-section-item">
            <div class="connection-item">
                <img src="image/city.png" alt="">
                <h3>Alumni in your City</h3>
                <p>
                    Lorem ipsum dolor sit a
                    met consectetur adipisicing elit. Dolore error ea
                    rerum aliquam repudiandae aperiam. A, eum! Obcaecat

                </p>
                <button>Alumni in your City</button>
            </div>
            <div class="connection-item">
                <img src="image/batchmate.png" alt="">
                <h3>Your Batchmates</h3>
                <p>
                    Lorem ipsum dolor sit a
                    met consectetur adipisicing elit. Dolore error ea
                    rerum aliquam repudiandae aperiam. A, eum! Obcaecat

                </p>
                <button>your Batchmate</button>
            </div>
            <div class="connection-item">
                <img src="image/alumnidirectory.png" alt="">
                <h3>Alumni Directory</h3>
                <p>
                    Lorem ipsum dolor sit a
                    met consectetur adipisicing elit. Dolore error ea
                    rerum aliquam repudiandae aperiam. A, eum! Obcaecat

                </p>
                <button>Alumni Directory</button>
            </div>
            <div class="connection-item">
                <img src="image/profile.png" alt="">
                <h3>Your Alumni Profile</h3>
                <p>
                    Lorem ipsum dolor sit a
                    met consectetur adipisicing elit. Dolore error ea
                    rerum aliquam repudiandae aperiam. A, eum! Obcaecat

                </p>
                <button>Your Alumni Profile</button>
            </div>

        </div>

    </div>

    <!-- alumni connection end -->




    <!-- About Section Start -->
    <section id="about-us" class="about">
        <center>
            <h1 class="heading">About us</h1>
        </center>

        <div class="container">


            <div class="row">
                <div class="col-md-5">
                    <img id="img-1" src="image/about us.png" alt="">
                </div>
                <div class="col-md-7 about-content">
                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Veritatis ullam recusandae perferendis,
                        cupiditate ratione qui neque error quos reprehenderit modi officia incidunt vitae mollitia,
                        animi nobis asperiores nesciunt blanditiis deserunt.</p>

                    <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Fugit modi omnis suscipit inventore,
                        esse laboriosam soluta voluptates deleniti veritatis? Veniam?</p>

                </div>

            </div>
        </div>
    </section>
    <!-- About Section end-->

      <!-- footer section -->

      <footer>
   
        <div class="footer-section">
            <div class="about-institute-section">
                <img src="image/iist logo.jpg" alt="">
                <p class="about">Indore Institute of Science and Technology, Indore was established 2003. IIST is recognized as a leading institute in the state of Madhya Pradesh.</p>
            </div>
    
            <div class="useful-links">
                <h2>UseFul links</h2>
                <div class="nav-links">
                    <li class="nav-items"><a href="">HOME</a></li>
                    <li class="nav-items"><a href="">ALUMNI</a></li>
                    <li class="nav-items"><a href="">NEWS&EVENT</a></li>
                    <li class="nav-items"><a href="">COMITEE</a></li>
                </div>
            </div>
    
            <div class="about useful-links">
                <h2>about</h2>
                <div class="nav-links">
                    <li class="nav-items"><a href="">SEARCH</a></li>
                    <li class="nav-items"><a href="">SEARCH</a></li>
                    <li class="nav-items"><a href="">JOb-POST</a></li>
                    <li class="nav-items"><a href="">Contact</a></li>
                </div>
            </div>
    
            <div class="social-media">
                <div class="Login-dashboard">
                    login Dashboard
                </div>

                    <div class="social-handels">
                        <i class="fa-brands fa-facebook" class="icons"></i>
                        <i class="fa-brands fa-instagram" class="icons"></i>
                        <i class="fa-brands fa-square-twitter" class="icons"></i>
                        <i class="fa-brands fa-linkedin" class="icons"></i>

                    </div>
            </div>
        </div>
    </footer>


    <hr/>

    <p class="copyright">� 2022 IIST Alumni / All rights reserved</p>

    <div class="end">

    </div>



    

      














    <!--Bootstrap JS CND-->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>

</body>