-- Rows from Person with matching rows from Address
SELECT
    Person.firstName,
    Person.lastName,
    Address.city,
    Address.state
FROM
    Person
LEFT JOIN Address ON Person.personID = Address.personID;

# UNION

# -- Rows from Address with non-matching rows from Person
# SELECT
#     Person.firstName,
#     Person.lastName,
#     NULL AS city,
#     NULL AS state
# FROM
#     Address
# LEFT JOIN Person ON Person.personID = Address.personID;
