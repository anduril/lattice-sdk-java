# Changelog

## [5.18.0] - 2026-07-13
### Added
- **`initialRetryDelayMillis()`**, **`maxRetryDelayMillis()`**, and **`retryJitterFactor()`** builder methods on `LatticeBuilder`, `AsyncLatticeBuilder`, and `ClientOptions.Builder` to configure exponential backoff timing for retries.
- **`ResponseDecompressionInterceptor`** transparently decompresses gzip and deflate encoded response bodies for requests with an explicit `Accept-Encoding` header.
- **`ClientOptions`** now exposes `initialRetryDelayMillis()`, `maxRetryDelayMillis()`, and `retryJitterFactor()` accessors.

### Changed
- **`OAuthTokenSupplier`** token caching is now thread-safe, preventing redundant token fetches under concurrent access.

