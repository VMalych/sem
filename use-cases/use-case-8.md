# USE CASE: 8 Delete an Employee's Details

## CHARACTERISTIC INFORMATION

### Goal in Context

As an HR advisor I want to delete an employee's details so that the company is compliant with data retention legislation.

### Scope

Company.

### Level

Primary task.

### Preconditions

We know the employee.  Database contains current employee salary data.

### Success End Condition

Employee details are deleted.

### Failed End Condition

No report is produced.

### Primary Actor

HR Advisor.

### Trigger

A request to delete employee details is sent to HR.

## MAIN SUCCESS SCENARIO

1. Employee detail deletion is requested.
2. HR advisor captures employee whose details are to be deleted.
3. HR advisor deletes employee's details.

## EXTENSIONS

3. **Employee does not exist**:
    1. HR advisor informs that no such employee exists.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0
