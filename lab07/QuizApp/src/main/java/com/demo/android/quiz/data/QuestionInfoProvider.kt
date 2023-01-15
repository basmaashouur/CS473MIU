package com.demo.android.quiz.data

import com.demo.android.quiz.data.model.Answer
import com.demo.android.quiz.data.model.Question

class QuestionInfoProvider {

    var questionList = initQuestionList()
    var answerList = initAnswersList()

    private fun initQuestionList(): MutableList<Question>{
        val questions = mutableListOf<Question>()
        questions.add(
            Question(1, "1. Which are the modules of Web layer?")
        )
        questions.add(
            Question(2, "2. Which is the correct implementation class of BeanFactory?")
        )
        questions.add(
            Question(3, "3. What is true about <list> collection configuration elements?")
        )
        questions.add(
            Question(4, "4. What is bean autowiring?")
        )
        questions.add(
            Question(5, "5. What is RequestHandledEvent:event?")
        )
        questions.add(
            Question(6, "6. How around advice works?")
        )
        questions.add(
            Question(7, "7. Which of the following database is not supported using jdbcTemplate?")
        )
        questions.add(
            Question(8, "8. Expression Language/ SpEL was introduced in which version of spring framework.")
        )
        questions.add(
            Question(9, "9. Which of the following class can be used to call Stored Procedures in spring?")
        )
        questions.add(
            Question(10, "10. What is the use of a content provider in Android?")
        )
        questions.add(
            Question(11, "11. While developing android application developers can test their apps on")
        )
        questions.add(
            Question(12, "12. In android, mini activities are also known as")
        )
        questions.add(
            Question(13, "13. Among the following choose the one which converts Java bytecode into Dalvik bytecode")
        )
        questions.add(
            Question(14, "14. The services in android can be stopped using which of the following method?")
        )
        questions.add(
            Question(15, "15. Activity in Android can be killed using?")
        )
        return questions
    }

    private fun initAnswersList(): MutableList<Answer>{
        val answers = mutableListOf<Answer>()

        answers.add(Answer(1, 1, true, "WebSocket, Servlet, Web, Portlet"))
        answers.add(Answer(2, 1, false, "WebSocket, Servlet, Web-MVC, Web"))
        answers.add(Answer(3, 1, false, "HTML, JSP, WEB, Portlet"))
        answers.add(Answer(4, 1, false, "HTML, Servlet, WEB, Portlet"))

        answers.add(Answer(5, 2, true, "XmlBeanFactory"))
        answers.add(Answer(6, 2, false, "ClassPathBeanFactory"))
        answers.add(Answer(7, 2, false, "FileSystemBeanFactory"))
        answers.add(Answer(8, 2, false, "AdvancedBeanFactory"))

        answers.add(Answer(9, 3, true, "This helps in wiring a list of values, allowing duplicates."))
        answers.add(Answer(10, 3, false, "This helps in wiring a list of values but without any duplicates."))
        answers.add(Answer(11, 3, false, "This can be used to inject a collection of name-value pairs where name and value can be of any type."))
        answers.add(Answer(12, 3, false, " This can be used to inject a collection of name-value pairs where the name and value are both Strings."))

        answers.add(Answer(13, 4, true, "Autowiring lets Spring resolve collaborators (other beans) for your bean by inspecting the contents of the BeanFactory without using <constructor-arg> and <property> elements."))
        answers.add(Answer(14, 4, false, "Autowiring injects values in spring beans."))
        answers.add(Answer(15, 4, false, "Autowiring injects one bean into another."))
        answers.add(Answer(16, 4, false, "Autowiring helps in wiring a list of values, allowing duplicates."))

        answers.add(Answer(17, 5, false, "This event is published when the Servlet Context is either initialized or refreshed."))
        answers.add(Answer(18, 5, false, "This event is published when the HTTP Request is received."))
        answers.add(Answer(19, 5, true, "This event is published when the HTTP session is initialized or refreshed."))
        answers.add(Answer(20, 5, false, "This event is published when the HTTP Request is serviced."))

        answers.add(Answer(21, 6, true, "Run advice before and after the advised method is invoked."))
        answers.add(Answer(22, 6,false, "Run advice before and after a class is loaded."))
        answers.add(Answer(23, 6, false, "Run advice before and after http response is returned."))
        answers.add(Answer(24, 6, false, "Run advice before and after http request is processed."))

        answers.add(Answer(25, 7, false, "MySql"))
        answers.add(Answer(26, 7, false, "PostgresSql"))
        answers.add(Answer(27, 7, true, "NoSql"))
        answers.add(Answer(28, 7, false, "Oracle"))

        answers.add(Answer(29, 8, false, "1.0"))
        answers.add(Answer(30, 8, false, "2.0"))
        answers.add(Answer(31, 8, true, "3.0"))
        answers.add(Answer(32, 8, false, "4.0"))

        answers.add(Answer(33, 9, false, "SPHelper"))
        answers.add(Answer(34, 9, false, "JdbcTemplateCall"))
        answers.add(Answer(35, 9, false, "JdbcTemplate"))
        answers.add(Answer(36, 9, true, "SimpleJdbcCall"))

        answers.add(Answer(37, 10, false, "For sharing the data between applications"))
        answers.add(Answer(38, 10, false, "For storing the data in the database"))
        answers.add(Answer(39, 10, true, "For sending the data from an application to another application"))
        answers.add(Answer(40, 10, false, "None of the above"))

        answers.add(Answer(41, 11, false, "Emulators in Android SDK"))
        answers.add(Answer(42, 11, false, "Android Phone"))
        answers.add(Answer(43, 11, false, "Third-Party Emulator"))
        answers.add(Answer(44, 11, true, "All the above"))

        answers.add(Answer(45, 12, false, "Adapter"))
        answers.add(Answer(46, 12, false, "Activity"))
        answers.add(Answer(47, 12, true, "Fragments"))
        answers.add(Answer(48, 12, false, "None"))

        answers.add(Answer(49, 13, true, "dex compiler"))
        answers.add(Answer(50, 13, false, "Mobile interpretive compare"))
        answers.add(Answer(51, 13, false, "Dalvik converter"))
        answers.add(Answer(52, 13, false, "None"))

        answers.add(Answer(53, 14, false, "system. exit()  method"))
        answers.add(Answer(54, 14, true, "stopSelf() and stopService() method"))
        answers.add(Answer(55, 14, false, "finish() method"))
        answers.add(Answer(56, 14, false, "end() method"))

        answers.add(Answer(57, 15, false, "finishActivity (int requestCode)"))
        answers.add(Answer(58, 15, false, "finish() method"))
        answers.add(Answer(59, 15, false, "neither a and b"))
        answers.add(Answer(60, 15, true, "Both"))

        return answers
    }

}