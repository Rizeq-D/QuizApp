package com.example.quizapp

object QuizContent {

    fun getQuestions() : ArrayList<Question> {

        val questionsList = ArrayList<Question>()

        val question1 = Question(
            1, "What is the capital of Australia?",
            "Sydney", "Melbourne",
            "Canberra", "Brisbane",
            "Canberra"
        )
        val question2 = Question(
            1, "What is the capital of Brazil?",
            "Rio de Janeiro", "Brasília",
            "São Paulo", "Salvador",
            "Brasília"
        )
        val question3 = Question(
            1, "What is the capital of Canada?",
            "Toronto", "Vancouver",
            "Montreal", "Ottawa",
            "Ottawa"
        )
        val question4 = Question(
            1, "What is the currency of Japan?",
            "Yen", "Yuan",
            "Baht", "Won",
            "Yen"
        )
        val question5 = Question(
            1, "What is the currency of Switzerland?",
            "Euro", "Pound",
            "Franc", "Krona",
            "Franc"
        )
        val question6 = Question(
            1, "What is the currency of South Africa?",
            "Shilling", "Dollar",
            "Peso", "Rand",
            "Rand"
        )
        val question7 = Question(
            1, "Who wrote Pride and Prejudice?",
            "Charlotte Brontë", "Mary Shelley",
            "Emily Dickinson", "Jane Austen",
            "Jane Austen"
        )
        val question8 = Question(
            1, "Who is the author of Moby-Dick?",
            "Mark Twain", "Herman Melville",
            "Edgar Allan Poe", "Nathaniel Hawthorne",
            "Herman Melville"
        )
        val question9 = Question(
            1, "Who wrote 1984?",
            "Aldous Huxley", "Ray Bradbury",
            "J.R.R. Tolkien", "George Orwell",
            "George Orwell"
        )
        val question10 = Question(
            1, "Who was the first woman to win a Nobel Prize?",
            "Marie Curie", "Rosalind Franklin",
            "Lise Meitner", "Dorothy Hodgkin",
            "Marie Curie"
        )
        val question11 = Question(
            1, "Who is known for discovering the structure of DNA?",
            "Ada Lovelace", "Rosalind Franklin",
            "Rachel Carson", "Barbara McClintock",
            "Rosalind Franklin"
        )
        val question12 = Question(
            1, "Who was the first woman to travel into space?",
            "Sally Ride", "Eileen Collins",
            "Valentina Tereshkova", "Mae Jemison",
            "Valentina Tereshkova"
        )
        val question13 = Question(
            1, "What ancient city in Syria was known for " +
                    "its massive library and trade routes?",
            "Ebla", "Aleppo",
            "Homs", "Damascus",
            "Ebla"
        )
        val question14 = Question(
            1, "Which ancient empire was centered in present-day Syria?",
            "Assyrian Empire", "Roman Empire",
            "Persian Empire", "Ottoman Empire",
            "Assyrian Empire"
        )
        val question15 = Question(
            1, "What is the ancient city of Palmyra in Syria famous for?",
            "Egyptian pyramids", "Roman ruins",
            "Ziggurats", "Hanging gardens",
            "Roman ruins"
        )
        val question16 = Question(
            1, "Who painted the Mona Lisa?",
            "Vincent van Gogh", "Pablo Picasso",
            "Leonardo da Vinci", "Michelangelo",
            "Leonardo da Vinci"
        )
        val question17 = Question(
            1, "Which artist is famous for the painting The Starry Night?",
            "Claude Monet", "Vincent van Gogh",
            "Edvard Munch", "Gustav Klimt",
            "Vincent van Gogh"
        )
        val question18 = Question(
            1, "Which of these is a famous work by Michelangelo?",
            "David", "The Scream",
            "he Persistence of Memory", "The Night Watch",
            "David"
        )

    }
}