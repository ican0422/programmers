-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME
FROM ANIMAL_OUTS
WHERE ANIMAL_ID NOT IN 
(
SELECT I.ANIMAL_ID
FROM ANIMAL_INS AS I
)
ORDER BY 1 ASC