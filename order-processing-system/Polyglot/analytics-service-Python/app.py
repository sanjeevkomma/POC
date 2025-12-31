from fastapi import FastAPI

app = FastAPI()

@app.post("/analyze")
def analyze(order: dict):
    score = order["amount"] * 0.1
    return {"riskScore": score}
