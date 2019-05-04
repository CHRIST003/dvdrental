# Dvd Rental and Sales Application

This application is about managing a small DVD rental and sale store, where DVD will have possible categories like horror, Scifi, drama, Romance, Comedy, action, cartoon.

The system will have user login before being accessed, The user can view the rents, sales report, for all the new release DVD the price is higher for sale and rent.

The application has an Admin that is in charge of that.

## Customers

Dvd Rental and sales store has two kind of customer, the difference between customer comes to credit, members differently pay to rent and buy from the store, they pay less than the normal customer. The followings are types of customer:

### Member
These are the customer allowed to rent and buy from the store.

### Normal Customer

They are allowed to buy and rent from the store, but pay a bit more from their credits.

### Requirement

For a customer to be added to the system he/she must pay before and based on the kind of customer he/she is.

All the sales and rents must be stored in the system.

Only authorised user can access the system.

## Rent

	Rent Movie
A customer can only rent one Dvd at a time. A customer can only rent if a previously rented Dvd has been returned. The attribute canRent indicates whether a customer is allowed to rent a Dvd: When a customer rents a Dvd this attribute is set to FALSE. When a customer returns a Dvd, this attribute is set to TRUE.

The customer must exist on the system before this transaction can take place. Use the customer’s phone number to verify this. 
The requested movie title must be verified to be on the system, as well as being available for rent.
The fee for a movie is R10, and new releases are R5 more. This fee is deducted from the customer’s credit.

If a customer has insufficient credit the option to pay the movie fee for this transaction is shown. The customer can choose to pay the required fee, or load R100 credit, or neither and thereby cancel the transaction. After a valid transaction, the rented movie is then marked as ‘not available’.
	


![](dvdRental.png)
