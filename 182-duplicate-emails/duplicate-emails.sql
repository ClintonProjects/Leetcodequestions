# Write your MySQL query statement below
SELECT email 
FROM PERSON  
group by email
HAVING 
COUNT(email) > 1;