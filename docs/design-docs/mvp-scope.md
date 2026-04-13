# MVP Scope

## Objective
Build the smallest useful system that supports:
- log collection
- trace collection
- query capability
- basic validation

## Included

### demo-app
- /health
- /api/success
- /api/error
- /api/slow

### logs
- structured JSON logs
- include traceId and spanId

### traces
- basic span hierarchy
- service name
- duration
- status

### pipeline
- OpenTelemetry Collector
- Vector
- local routing

### query API
- get trace by traceId
- search logs by filters
- list services

## Excluded
- UI dashboard (beyond Grafana)
- advanced analytics
- distributed system complexity
- multi-service orchestration