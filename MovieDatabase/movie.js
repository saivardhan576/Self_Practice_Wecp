const movies = [
    {
        "title" : "Salaar",
        "genre" : "Triller",
        "rating" : 9.5
    },
    {
        "title" : "Guntur karam",
        "genre" : "Comedy",
        "rating" : 3.5
    },
    {
        "title" : "Pushpa",
        "genre" : "Triller",
        "rating" : 8
    },
    {
        "title" : "Rab ne bana di jodi",
        "genre" : "Romance",
        "rating" : 9.5
    },
     {
        "title" : "Ae dil hai mushkil",
        "genre" : "Romance",
        "rating" : 9.5
    }
    ];
    movies.sort((m1, m2) => {
        return m1.title.localeCompare(m2.title);
    });
    
    console.log(movies);
    
    const ratingBelowFiveMovies = movies.filter((m)=>{return m.rating<5});
    console.log(ratingBelowFiveMovies);
    
    const highRatedMovies = movies.filter((m) => m.rating >8);
    console.log(highRatedMovies);
    
    movies.forEach((o) => {
        console.log(`Title : ${o.title},
        Genre : ${o.genre},
        Rating : ${o.rating}`)
    } );
