/*
Enter your query below.
Please append a semicolon ";" at the end of the query
*/

--1 is only plagiarism statement

--2
-- get columns: dept tbl.name, count func passing in course tbl.id as args
select d.name, count(c.id)
-- get tables, rename as letters
from department d, course c
-- set rows to equal each other/ relationship
where d.id = c.deptId
-- return by dept.Id
-- 'each' means group by: dept.id/also necessary bc we used an aggregate func on top to count
group by d.id -- each dept id/name
-- result is sorted FIRST by the count, least to greatest number
-- result is sorted SECOND by dept name alphabetically
order by count(c.id) asc, d.name asc;

--3
-- get columns: course tbl.name, count func passing in studentcourse.studentId to find num of stds in ea class for course popularity
select c.name, count(sc.studentId)
-- get tables, rename as letters
from course c, studentcourse sc
-- set rows to equal each other/ relationship
where c.id = sc.courseId
-- 'each' means group by expected result: c.id/also necessary bc we used an aggregate func on top to count
group by c.id
-- result is sorted FIRST by the count, greatest to smaller num of students
-- result is sorted SECOND by dept name alphabetically
order by count(sc.studentId) desc, c.name asc;

--4
-- get column: course tbl.name
select c.name
-- get table, rename as letter
from course c
-- condition is find course by id that is not on the faculty table by same id
where c.id not in (select distinct courseId from facultycourse )
-- return course names, not found in faculty table, in sorted alphabetical order because filtered result=names=letters
order by c.name asc;

--5 LIST # OF STUDENTS IN COURSES WITHOUT FACULTY







