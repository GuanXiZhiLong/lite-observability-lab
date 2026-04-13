# AGENTS.md

## Mission
This repository is a learning-oriented lab for AI-assisted software development.
The goal is to build a lightweight observability platform for tracing, log collection,
and debugging workflows that Codex can use to validate generated code.

## Read This First
Before making changes, read in order:
1. `README.md`
2. `ARCHITECTURE.md`
3. `ROADMAP.md`
4. `docs/design-docs/index.md`
5. relevant files under `docs/api-specs/`, `docs/db/`, and `docs/standards/`

## Repository Map
- `services/` : application services
- `infra/` : local observability stack and infrastructure config
- `docs/` : source of truth for design, plans, API specs, DB specs, and standards
- `scripts/` : local dev and CI helper scripts

## Working Rules
- Do not introduce new frameworks unless required by the current task.
- Prefer boring, stable, well-documented libraries.
- Keep modules small and responsibilities explicit.
- Add or update documentation for any architectural or API change.
- Add tests for behavior changes.
- Use structured logging and OpenTelemetry tracing where applicable.

## Execution Flow
For each task:
1. inspect relevant docs and code
2. write or update a short execution plan if the task is non-trivial
3. implement the smallest useful change
4. run tests and local verification
5. update docs if behavior, APIs, or schema changed
6. summarize what changed and any follow-up work

## Constraints
- Java 21
- Spring Boot 3.x
- Maven
- Docker Compose for local integration
- Grafana + OpenTelemetry Collector + Vector in local environment