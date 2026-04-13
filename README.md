# lite-observability-lab

A learning-oriented lightweight observability platform for AI-assisted development.

## Overview
This project is designed as a lab environment to explore how AI agents (e.g., Codex) can develop, validate, and debug software using observability signals such as logs and traces.

The system focuses on enabling automated feedback loops:
- generate code
- run service
- collect logs and traces
- analyze failures
- guide fixes

## Goals
- Provide lightweight log and trace collection
- Enable debugging workflows for AI-generated code
- Support query and analysis of logs and traces
- Build a reproducible local observability stack
- Serve as a GitHub-based learning experiment

## Non-Goals
- Not a full production observability platform
- Not a replacement for SkyWalking, Jaeger, or Elastic
- Not focused on multi-tenancy or large-scale distributed systems

## Tech Stack
- Java 21
- Spring Boot 3.x
- Maven
- Docker Compose
- Grafana
- OpenTelemetry Collector
- Vector
- PostgreSQL
- (Optional later) ClickHouse

## Repository Structure
See:
- AGENTS.md (entry point for AI agents)
- ARCHITECTURE.md (system design)
- ROADMAP.md (execution plan)
- docs/ (source of truth for design and specifications)

## MVP Scope
- One demo service (instrumented)
- One local observability stack
- One query API (logs + traces)
- Basic validation workflow

## Principles
- Documentation is part of the system
- Prefer simple and stable technologies
- Optimize for AI readability and verifiability
- Keep local setup reproducible