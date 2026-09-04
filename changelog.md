# Changelog

## [6.0.0] - 2026-09-04

## [5.24.0] - 2026-09-03

**Added**

- video() accessor on Lattice and AsyncLattice returning VideoClient/AsyncVideoClient for video stream management.
- Video clients — new VideoClient, AsyncVideoClient, RawVideoClient, and AsyncRawVideoClient for managing live video ingress and egress streams, with synchronous, CompletableFuture, and raw LatticeHttpResponse variants.
- Ingress and egress stream operations — list, create, get, and delete methods for both ingress and egress streams, each with request and RequestOptions overloads.
- Stream types and settings — IngressStream, EgressStream, request/response wrappers, the IngressStreamStatus lifecycle enum, and transport types (RtspIngress, SrtIngress, MpegTsIngress, RtspSettings, SrtSettings with optional AES passphrase, etc.).
- Error and status types — video error types (BadRequestError, UnauthorizedError, NotFoundError, ConflictError, and more) plus GoogleRpcStatus and GoogleProtobufAny for error payloads.

## [5.23.2] - 2026-08-24

## [5.23.1] - 2026-08-21

## [5.23.0] - 2026-08-12

## [5.22.0] - 2026-07-29

## [5.21.0] - 2026-07-22

## [5.20.0] - 2026-07-21
### Added
- **`Entity.getKinematics()`** and **`Entity.Builder.kinematics()`** — supply higher-granularity kinematics data, preferred for Track Entities over `location`/`locationUncertainty`.
- **`Kinematics`**, **`KinematicsGeodetic`**, and **`KinematicsGeocentric`** — new types conveying location, velocity, acceleration, attitude, and measurement time in geodetic and geocentric (ECEF) reference frames.
- **`LocationGeodetic`** and **`LocationGeocentricEcef`** — new types for WGS84 geodetic and Earth-centered Earth-fixed coordinates.
- **`Altitude`** and datum-specific altitude types (above ground level, mean sea level EGM96/pressure, sea floor, standard datum plane, WGS84 ellipsoid, below sea surface) — represent altitude across multiple reference datums.
- **`AltitudeProvenance`**, **`AltitudeProvenanceSourceType`**, **`TMat3`**, and **`Vec3`** — describe altitude sourcing (barometer, GNSS, sonar, etc.) plus supporting 3D vector and 3x3 covariance matrix types.

## [5.19.0] - 2026-07-16

