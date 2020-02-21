package com.example.notekeeper

class DataManager {
    val courses = HashMap<String,CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init{
        initializeCourses()

    }
    private fun initializeCourses(){
        var course = CourseInfo("android_intents", "Android programming with Intents")
        courses.set(course.courseId,course)

        course = CourseInfo("android_async", "Android Async Programming and services")
        courses.set(course.courseId,course)

        course = CourseInfo("java_lang ", "Java fundamentals : The Java Language")
        courses.set(course.courseId,course)


        course = CourseInfo("java_core", "Java fundamentals : The Core Platform")
        courses.set(course.courseId,course)

    }
}