-- 코드를 입력하세요
SELECT ANIMAL_TYPE, COUNT(*) AS "count"
FROM ANIMAL_INS
GROUP BY 1
ORDER BY 1 ASC;