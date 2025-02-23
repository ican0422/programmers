-- 코드를 입력하세요
SELECT  P.PRODUCT_CODE,
        SUM(P.PRICE * O.SALES_AMOUNT) AS SALES
FROM PRODUCT AS P INNER JOIN OFFLINE_SALE AS O ON P.PRODUCT_ID = O.PRODUCT_ID
GROUP BY 1
ORDER BY 2 DESC, 1 ASC;
