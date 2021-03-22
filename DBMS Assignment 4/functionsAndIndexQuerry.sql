Drop FUNCTION getOrders;
DELIMITER //
CREATE FUNCTION getOrders(date1 DATE) RETURNS int DETERMINISTIC
BEGIN
return (select count(OID) from Orders where month(Date)=month(date1) and year(Date)=year(date1) group by Date);	

END;//

select getOrders(CURDATE());//




CREATE FUNCTION getMonths(date1 DATE) RETURNS int DETERMINISTIC
BEGIN
return (select Month(Date) from Orders where year(Date)=year(date1) group by Date order by count(OID) desc limit 1);	
END;//

select getMonths(CURDATE());//




CREATE PROCEDURE averageSale(date1 Date)
BEGIN
  select avg(t1.OrderTotal),t2.PID from Orders t1 INNER JOIN ShoppersOrder t2 ON t1.OID=t2.OID where month(Date)=month(date1) and year(Date)=year(date1) Group by t2.PID ;
END;//

CALL averageSale(curdate());//



CREATE PROCEDURE getOrderDetails(date1 Date,date2 Date)
BEGIN
  if(date2<date1)
  then
  set date1=date_format(date1,'%Y-%m-01');
  end if;
  select OID,Status from Orders where date between date1 and date2;
 
END;//

CALL getOrderDetails('2021-02-05','2021-03-16');//







ALTER TABLE Orders ADD INDEX indexOID (OID);//
ALTER TABLE Products ADD INDEX indexPID (PID);//
ALTER TABLE Categories ADD INDEX indexCID (CID);//






