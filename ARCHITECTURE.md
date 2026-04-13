# ARCHITECTURE

## System Overview

The system consists of three main parts:

1. Demo Application (observed system)
2. Observability Pipeline (collection and storage)
3. Query & Validation Layer

## High-Level Flow

demo-app
-> logs + traces
-> OpenTelemetry Collector / Vector
-> storage (PostgreSQL / ClickHouse)
-> lab-api
-> query + validation

## Components

### demo-app
- Spring Boot service
- Generates logs and traces
- Provides test endpoints (normal, error, slow)

### observability pipeline
- OpenTelemetry Collector: trace ingestion
- Vector: log ingestion and routing
- Responsible for normalization and forwarding

### storage
- PostgreSQL: metadata, validation results
- ClickHouse (optional): logs and traces

### lab-api
- Query logs and traces
- Provide validation summaries
- Serve as debugging interface for AI agents

## Design Principles

- Keep architecture simple and modular
- Prefer explicit data flow over implicit coupling
- Ensure each component can be run locally
- Optimize for debuggability, not feature completeness

## Future Extensions

- anomaly detection
- automated validation scoring
- integration with CI/CD