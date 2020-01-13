package newCoder;

/**
 * @author: Bravery
 * @create: 2019-09-18 15:36
 **/


enum AccountType {
    SAVING, FIXED, CURRENT;
    private AccountType()
    {
        System.out.println("It is a account type");
    }

}
