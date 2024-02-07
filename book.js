class Book{
    constructor(bookId, bookTitle, author,publishedYear){
        this.bookId=bookId;
        this.bookTitle=bookTitle;
        this.author=author;
        this.publishedYear=publishedYear;
    }
    showDetails(){
        console.log(`Book Details :: Id = ${this.bookId} Title = ${this.bookTitle} Author = ${this.author} Published year = ${this.publishedYear}`);
    }
}
let book1= new Book(1,"Half Girlfriend","Chetan bhagath","2013");
book1.showDetails();
