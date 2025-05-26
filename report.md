
# Report

## EMFModel

| Test | Status | Reason |
| --- | --- | --- |
| Num OCL | ✅ Passed | - |
| Five Or More Classes | ✅ Passed | - |
| Model Exists | ✅ Passed | - |
| Num Assocs | ✅ Passed | - |
| Num Attributes | ✅ Passed | - |
| Model Validates | ✅ Passed | - |
## Code Gen And Ocl

| Test | Status | Reason |
| --- | --- | --- |
| Pass Instance1 | ❌ Failed | Validation should pass. |
| Fail Instance2Exists | ❌ Failed | Instance that fails validation must be in file model/c2/fail.xmi |
| Pass Instance2Exists | ❌ Failed | Instance that passes validation must be in file model/c2/pass.xmi |
| Pass Instance2 | ❌ Failed | ⚠️ FileNotFoundException |
| Code Generated | ✅ Passed | - |
| Pass Instance1Exists | ✅ Passed | - |
| Fail Instance1Exists | ✅ Passed | - |
| Fail Instance1 | ❌ Failed | Validation should fail. |
| Fail Instance2 | ❌ Failed | ⚠️ FileNotFoundException |
## Ecore Ocl

| Test | Status | Reason |
| --- | --- | --- |
| Model Exists | ❌ Failed | lpg/runtime/RuleAction |
