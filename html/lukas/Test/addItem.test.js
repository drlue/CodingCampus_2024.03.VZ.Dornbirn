// test.js
//const expect = chai.expect;
//chai.use(chai.spy);

/*
    describe('addItem()', function() {
        it('should return the sum of two numbers', function() {
            expect(addItem()).to.equal(3);
            expect(add(-1, 1)).to.equal(0);
        });

        it('should handle negative numbers', function() {
            expect(add(-1, -1)).to.equal(-2);
        });
    });

*/

describe('removeItem()', function () {

    let toDoArrayBackup;

    //prepare before test
    before(function () {
        //make a copy of original array
        toDoArrayBackup = [...toDoArray];

        //create some test data
        toDoArray.push(
            { text: 'Testtask 1', date: '2024-05-28', status: 'pending' },
            { text: 'Testtask 2', date: '2024-05-29', status: 'pending' }
        )

        //mock resetInputContainer() and displayToDoList()
        chai.spy.on(window, 'resetInputContainer');
        chai.spy.on(window, 'displayToDoList');
        chai.spy.on(localStorage, 'setItem');      

    });


    //do after test
    after(function () {
        // Restore the original toDoArray
        toDoArray = toDoArrayBackup;

        // Restore the original functions
        chai.spy.restore('resetInputContainer');
        chai.spy.restore('displayToDoList');
    });



    //test
    it('should remove an intem from toDoArray', function () {
        //Call removeItem function
        removeItem(0);

        //Assertion
        expect(toDoArray).to.have.lengthOf(1);
        expect(toDoArray[0]).to.deep.equal({
            text: 'Testtask 2',
            date: '2024-05-29',
            status: 'pending'
        });


    });

    it('should handle negative numbers', function () {
        expect(subtract(-1, -1)).to.equal(0);
    });
});
