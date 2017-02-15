# HibOneToOne_Ann_Unidirectional_Shared_Primary_Key_01
Hibernate One to One Annotation based App with shared primary key

<b>Important Points</b>
1.  Author class is an owning side of association (Unidirectional associations doesn’t have inverse side). Owning side is determined by existence of primary key.
2.  Unidirectional association implies existence of reference just in one class (In our case it’s @OneToONe annotation in Author class).
3.  The @PrimaryKeyJoinColumn annotation specifies the primary key column that is used as a foreign key to join to another table.

<b>@PrimaryKeyJoinColumn</b>
1. Specifies a primary key column that is used as a foreign key to join to another table. 
2. It may be used in a OneToOne mapping in which the primary key of the referencing entity is used as a foreign key to the referenced entity. 



