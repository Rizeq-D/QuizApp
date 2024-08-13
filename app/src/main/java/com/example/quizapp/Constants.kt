package com.example.quizapp

import Question

object Constants {

    const val USER_NAME : String = "user_name"

    fun getQuestions() : ArrayList<Question> {

        val questionsList = ArrayList<Question>()

        val question1 = Question(
            1, "What is the capital of Australia?",
            "Sydney", "Melbourne",
            "Canberra", "Brisbane",
            3
        )
        questionsList.add(question1)

        val question2 = Question(
            1, "What is the capital of Brazil?",
            "Rio de Janeiro", "Brasília",
            "São Paulo", "Salvador",
            2
        )
        questionsList.add(question2)

        val question3 = Question(
            1, "What is the capital of Canada?",
            "Toronto", "Vancouver",
            "Montreal", "Ottawa",
            4
        )
        questionsList.add(question3)

        val question4 = Question(
            1, "What is the currency of Japan?",
            "Yen", "Yuan",
            "Baht", "Won",
            1
        )
        questionsList.add(question4)

        val question5 = Question(
            1, "What is the currency of Switzerland?",
            "Euro", "Pound",
            "Franc", "Krona",
            3
        )
        questionsList.add(question5)

        val question6 = Question(
            1, "What is the currency of South Africa?",
            "Shilling", "Dollar",
            "Peso", "Rand",
            4
        )
        questionsList.add(question6)

        val question7 = Question(
            1, "Who wrote Pride and Prejudice?",
            "Charlotte Brontë", "Mary Shelley",
            "Emily Dickinson", "Jane Austen",
            4
        )
        questionsList.add(question7)

        val question8 = Question(
            1, "Who is the author of Moby-Dick?",
            "Mark Twain", "Herman Melville",
            "Edgar Allan Poe", "Nathaniel Hawthorne",
            2
        )
        questionsList.add(question8)

        val question9 = Question(
            1, "Who wrote 1984?",
            "Aldous Huxley", "Ray Bradbury",
            "J.R.R. Tolkien", "George Orwell",
            4
        )
        questionsList.add(question9)

        val question10 = Question(
            1, "Who was the first woman to win a Nobel Prize?",
            "Marie Curie", "Rosalind Franklin",
            "Lise Meitner", "Dorothy Hodgkin",
            1
        )
        questionsList.add(question10)

        val question11 = Question(
            1, "Who is known for discovering the structure of DNA?",
            "Ada Lovelace", "Rosalind Franklin",
            "Rachel Carson", "Barbara McClintock",
            2
        )
        questionsList.add(question11)

        val question12 = Question(
            1, "Who was the first woman to travel into space?",
            "Sally Ride", "Eileen Collins",
            "Valentina Tereshkova", "Mae Jemison",
            3
        )
        questionsList.add(question12)

        val question13 = Question(
            1, "What ancient city in Syria was known for " +
                    "its massive library and trade routes?",
            "Ebla", "Aleppo",
            "Homs", "Damascus",
            1
        )
        questionsList.add(question13)

        val question14 = Question(
            1, "Which ancient empire was centered in present-day Syria?",
            "Assyrian Empire", "Roman Empire",
            "Persian Empire", "Ottoman Empire",
            1
        )
        questionsList.add(question14)

        val question15 = Question(
            1, "What is the ancient city of Palmyra in Syria famous for?",
            "Egyptian pyramids", "Roman ruins",
            "Ziggurats", "Hanging gardens",
            2
        )
        questionsList.add(question15)

        val question16 = Question(
            1, "Who painted the Mona Lisa?",
            "Vincent van Gogh", "Pablo Picasso",
            "Leonardo da Vinci", "Michelangelo",
            3
        )
        questionsList.add(question16)

        val question17 = Question(
            1, "Which artist is famous for the painting The Starry Night?",
            "Claude Monet", "Vincent van Gogh",
            "Edvard Munch", "Gustav Klimt",
            2
        )
        questionsList.add(question17)

        val question18 = Question(
            1, "Which of these is a famous work by Michelangelo?",
            "David", "The Scream",
            "he Persistence of Memory", "The Night Watch",
            1
        )
        questionsList.add(question18)

        return questionsList
    }
}