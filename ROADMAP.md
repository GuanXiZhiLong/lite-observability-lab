# ROADMAP

## Phase 0: Repository Setup
- define project vision
- create documentation structure
- establish standards
- prepare AGENTS.md

## Phase 1: Minimal Observability Pipeline
- build demo-app (Spring Boot)
- add structured logging
- add OpenTelemetry tracing
- set up Docker Compose:
    - Grafana
    - OpenTelemetry Collector
    - Vector

## Phase 2: Query Layer
- implement lab-api
- log query endpoint
- trace query endpoint
- basic filtering

## Phase 3: Validation Workflow
- define validation run model
- detect:
    - errors
    - slow spans
    - missing responses
- return validation summary

## Phase 4: AI Integration
- enable Codex-driven debugging loops
- allow automated verification
- add test scenarios

## Phase 5: Enhancements
- anomaly detection
- pattern clustering
- alert rules