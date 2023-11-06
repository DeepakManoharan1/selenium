Feature: 
  Book cart application dmo

  Scenario: 
    Login should be sucess

    Given user enters into the website
    And user click on login link
    And user enters name as ortonoi
    And user enetrs the password as pass1234
    When user click the login button
    Then login success
    
    #Scenario: 
    #Login should be fail
#
    #Given user enters into the website
    #And user click on login link
    #And user enters name as ortonoi
    #And user enetrs the password as pass1234
    #When user click the login button
    #But login fail
