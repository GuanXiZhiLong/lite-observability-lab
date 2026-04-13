# Logging Standards

## Format
All logs must be structured JSON.

## Required Fields
- timestamp
- level
- serviceName
- traceId
- spanId
- message

## Optional Fields
- logger
- thread
- exception
- attributes

## Principles
- logs must be machine-readable
- avoid free-form text only logs
- include correlation identifiers (traceId)

## Example

{
"timestamp": "2026-04-03T12:00:00Z",
"level": "ERROR",
"serviceName": "demo-app",
"traceId": "abc123",
"spanId": "def456",
"message": "failed to process request"
}