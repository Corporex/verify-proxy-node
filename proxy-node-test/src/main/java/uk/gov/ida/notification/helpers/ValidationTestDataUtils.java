package uk.gov.ida.notification.helpers;

import java.util.UUID;

public class ValidationTestDataUtils {

    public static String sample_requestId = "_" + UUID.randomUUID().toString();

    public static String sample_eidasRequestId = "_" + UUID.randomUUID().toString();

    public static String sample_levelofAssurance = "LEVEL_2";

    public static String sample_destinationUrl = "http://proxy-node/SAML2/SSO/Response";

    public static String sample_issuer = "sample_issuer";

    public static String sample_connectorEncryptionCertificate =
            "MIID3jCCAsagAwIBAgIUUT6I3z4MM3dm/ilYlSyP3zsmExcwDQYJKoZIhvcNAQEL\n" +
            "BQAwcTELMAkGA1UEBhMCR0IxDzANBgNVBAgTBkxvbmRvbjEPMA0GA1UEBxMGTG9u\n" +
            "ZG9uMRcwFQYDVQQKEw5DYWJpbmV0IE9mZmljZTEMMAoGA1UECxMDR0RTMRkwFwYD\n" +
            "VQQDExBJREEgSW50ZXIgQ0EgRGV2MCAXDTE4MTIyMDE2MzAwMFoYDzIxMTgxMTI2\n" +
            "MTYzMDAwWjB9MQswCQYDVQQGEwJHQjEPMA0GA1UECBMGTG9uZG9uMQ8wDQYDVQQH\n" +
            "EwZMb25kb24xFzAVBgNVBAoTDkNhYmluZXQgT2ZmaWNlMQwwCgYDVQQLEwNHRFMx\n" +
            "JTAjBgNVBAMTHElEQSBTdHViIENvdW50cnkgU2lnbmluZyBEZXYwggEiMA0GCSqG\n" +
            "SIb3DQEBAQUAA4IBDwAwggEKAoIBAQDB1iglcLKZVk7vBgU8A7a/aW/ZXhfznu4v\n" +
            "G/HfMKCTKUwhQKPVENCZu72MGxLTRfOMc772aVs6pLMl4nG5wS0k20J6zlSH7uj5\n" +
            "8FiPTz6x7y8lCItqIkotk9UpRQ5iLOBIaBiSG8h8evZAqY/RamNWydJxC6jtdpRM\n" +
            "cRiKSyQ4wSvssLMyq7PelkSVlhacmhDNKaYwhdXtXpAz0Tt0IY3SykLwydOUcdGc\n" +
            "wAdaKLSKZNi+uAQypvKwNVIeQrJ8yNEqY6mydqWCM6D2kedw93Be1W8yIvlZcHdm\n" +
            "GI2YqeN6k2ibHUYKIFwnlwypji1FriktDkqbZWZCdudAoyMHIPQHAgMBAAGjYDBe\n" +
            "MA4GA1UdDwEB/wQEAwIHgDAMBgNVHRMBAf8EAjAAMB0GA1UdDgQWBBQnTxeeyIfK\n" +
            "UMwbXGuy5Rd/H4wIRzAfBgNVHSMEGDAWgBSz0PHKeF2RW62C9mRhKzcql+FLNTAN\n" +
            "BgkqhkiG9w0BAQsFAAOCAQEAqgRiTaPK6eHF9krxGcHGY0gm73NE1SjrlJtNSDpS\n" +
            "A0f66E4p6kaUhTuYjChvnKtbVJobYVegPOsp43dQ8cyUorC5EA/WbxJ31LeF0gMk\n" +
            "c5TW0CIwphLzfAnlLfAr0NhCI6vh45F85V2VzQSG77ugOdiZtBfXfdtRCsndqpKU\n" +
            "FvXx1vfHYhEOROwlFb/0uF/lbSMAGW6/13EOVYPy8mrum24DvBuq9guLe3IBinPL\n" +
            "myvbQ1HVAbYjQ3o714FR6aq2ZBWvZv3CmEjMlj0ut+sy114IRpKtpm5PMl9Z7Gjh\n" +
            "Zu3o2PJGTdJLxxOnoPxBTsbxKyxgGEYuyvz2TVYDEgXrBw==";

    public static String sample_hubSamlAuthnRequest = "PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiPz48c2FtbDJwOkF1dGhuUmVxdWVzdCB4bWxuczpzYW1sMnA9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDpwcm90b2NvbCIgRGVzdGluYXRpb249ImRlc3RpbmF0aW9uIiBJRD0icmVxdWVzdF9pZCIgSXNzdWVJbnN0YW50PSIyMDE5LTAyLTI4VDA5OjU0OjAwLjAwMFoiIFByb3RvY29sQmluZGluZz0idXJuOm9hc2lzOm5hbWVzOnRjOlNBTUw6Mi4wOmJpbmRpbmdzOkhUVFAtUE9TVCIgVmVyc2lvbj0iMi4wIiB4bWxuczp4c2k9Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvWE1MU2NoZW1hLWluc3RhbmNlIiB4c2k6dHlwZT0ic2FtbDJwOkF1dGhuUmVxdWVzdFR5cGUiPgogICA8c2FtbDI6SXNzdWVyIHhtbG5zOnNhbWwyPSJ1cm46b2FzaXM6bmFtZXM6dGM6U0FNTDoyLjA6YXNzZXJ0aW9uIj5pc3N1ZXI8L3NhbWwyOklzc3Vlcj4KICAgPGRzOlNpZ25hdHVyZSB4bWxuczpkcz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC8wOS94bWxkc2lnIyI+CjxkczpTaWduZWRJbmZvPgo8ZHM6Q2Fub25pY2FsaXphdGlvbk1ldGhvZCBBbGdvcml0aG09Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvMTAveG1sLWV4Yy1jMTRuIyIvPgo8ZHM6U2lnbmF0dXJlTWV0aG9kIEFsZ29yaXRobT0iaHR0cDovL3d3dy53My5vcmcvMjAwMS8wNC94bWxkc2lnLW1vcmUjcnNhLXNoYTI1NiIvPgo8ZHM6UmVmZXJlbmNlIFVSST0iI3JlcXVlc3RfaWQiPgo8ZHM6VHJhbnNmb3Jtcz4KPGRzOlRyYW5zZm9ybSBBbGdvcml0aG09Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvMDkveG1sZHNpZyNlbnZlbG9wZWQtc2lnbmF0dXJlIi8+CjxkczpUcmFuc2Zvcm0gQWxnb3JpdGhtPSJodHRwOi8vd3d3LnczLm9yZy8yMDAxLzEwL3htbC1leGMtYzE0biMiLz4KPC9kczpUcmFuc2Zvcm1zPgo8ZHM6RGlnZXN0TWV0aG9kIEFsZ29yaXRobT0iaHR0cDovL3d3dy53My5vcmcvMjAwMS8wNC94bWxlbmMjc2hhMjU2Ii8+CjxkczpEaWdlc3RWYWx1ZS8+CjwvZHM6UmVmZXJlbmNlPgo8L2RzOlNpZ25lZEluZm8+CjxkczpTaWduYXR1cmVWYWx1ZS8+CjwvZHM6U2lnbmF0dXJlPgogICA8c2FtbDJwOlJlcXVlc3RlZEF1dGhuQ29udGV4dCBDb21wYXJpc29uPSJtaW5pbXVtIj4KICAgICAgPHNhbWwyOkF1dGhuQ29udGV4dENsYXNzUmVmIHhtbG5zOnNhbWwyPSJ1cm46b2FzaXM6bmFtZXM6dGM6U0FNTDoyLjA6YXNzZXJ0aW9uIj5odHRwOi8vZWlkYXMuZXVyb3BhLmV1L0xvQS9zdWJzdGFudGlhbDwvc2FtbDI6QXV0aG5Db250ZXh0Q2xhc3NSZWY+CiAgIDwvc2FtbDJwOlJlcXVlc3RlZEF1dGhuQ29udGV4dD4KPC9zYW1sMnA6QXV0aG5SZXF1ZXN0Pgo=";

    public static String sample_hubSamlResponse = "PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiPz48c2FtbDJwOlJlc3BvbnNlIHhtbG5zOnNhbWwycD0idXJuOm9hc2lzOm5hbWVzOnRjOlNBTUw6Mi4wOnByb3RvY29sIiB4bWxuczp4c2k9Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvWE1MU2NoZW1hLWluc3RhbmNlIiBEZXN0aW5hdGlvbj0iaHR0cDovL3Byb3h5LW5vZGUvU0FNTDIvU1NPL1Jlc3BvbnNlIiBJRD0iZGVmYXVsdC1yZXNwb25zZS1pZCIgSW5SZXNwb25zZVRvPSJkZWZhdWx0LXJlcXVlc3QtaWQiIElzc3VlSW5zdGFudD0iMjAxOS0wNi0xOVQxNDo0MTowNy4zMjNaIiBWZXJzaW9uPSIyLjAiIHhzaTp0eXBlPSJzYW1sMnA6UmVzcG9uc2VUeXBlIj48c2FtbDI6SXNzdWVyIHhtbG5zOnNhbWwyPSJ1cm46b2FzaXM6bmFtZXM6dGM6U0FNTDoyLjA6YXNzZXJ0aW9uIj5odHRwczovL3NpZ25pbi5zZXJ2aWNlLmdvdi51azwvc2FtbDI6SXNzdWVyPjxkczpTaWduYXR1cmUgeG1sbnM6ZHM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvMDkveG1sZHNpZyMiPgo8ZHM6U2lnbmVkSW5mbz4KPGRzOkNhbm9uaWNhbGl6YXRpb25NZXRob2QgQWxnb3JpdGhtPSJodHRwOi8vd3d3LnczLm9yZy8yMDAxLzEwL3htbC1leGMtYzE0biMiLz4KPGRzOlNpZ25hdHVyZU1ldGhvZCBBbGdvcml0aG09Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvMDQveG1sZHNpZy1tb3JlI3JzYS1zaGEyNTYiLz4KPGRzOlJlZmVyZW5jZSBVUkk9IiNkZWZhdWx0LXJlc3BvbnNlLWlkIj4KPGRzOlRyYW5zZm9ybXM+CjxkczpUcmFuc2Zvcm0gQWxnb3JpdGhtPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwLzA5L3htbGRzaWcjZW52ZWxvcGVkLXNpZ25hdHVyZSIvPgo8ZHM6VHJhbnNmb3JtIEFsZ29yaXRobT0iaHR0cDovL3d3dy53My5vcmcvMjAwMS8xMC94bWwtZXhjLWMxNG4jIi8+CjwvZHM6VHJhbnNmb3Jtcz4KPGRzOkRpZ2VzdE1ldGhvZCBBbGdvcml0aG09Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvMDQveG1sZW5jI3NoYTI1NiIvPgo8ZHM6RGlnZXN0VmFsdWU+Z2FRUjJoNGMzZVVBcmdiUGZHRUIvSDVLdGZ0dFdaZmYrdGhYZXBNa0lKRT08L2RzOkRpZ2VzdFZhbHVlPgo8L2RzOlJlZmVyZW5jZT4KPC9kczpTaWduZWRJbmZvPgo8ZHM6U2lnbmF0dXJlVmFsdWU+CkVsbzNrSTdkcXdlOXJWMjR4Mk1DbzNnell1TVRaVktDQnFZWklhUlcxNEFkbFNtWms0eEFiVFY2L1AwZFQzK0Z0V1Iza2tYNks5emwmIzEzOwpRNFpRM1NMd0Q4REozdmVTRFBJcXhxWEI2STh2TmVJQ1VmTndzRDFPbDJRRmo5a2JaSnB1cmJ1OEt3Z3NXL2thbHRxSkRjU0pNRW5WJiMxMzsKT3JtVGJBMGJLS1c3NWMxRG55NkRWK0srMmFXa1NEWWpWQllGTmxaczlhajdMeHVvZThnbllPczlpRDdoekFGdVphNGwwcGhNVE5XcSYjMTM7ClVqYUdhblQyWWlFbS9jR2pYejcvb2swVXZKdFI4TGhFVFozNzlvYm5TVGJtQmhhbVVEQ3JuVkRpWkE0L2tIOW1kUThkVGNmeFkxSG8mIzEzOwpaeS9OakZDWGdhQ1kvbGptUlZETUxKdHAvVlJUTmZRSkVtUUZkdz09CjwvZHM6U2lnbmF0dXJlVmFsdWU+CjwvZHM6U2lnbmF0dXJlPjxzYW1sMnA6U3RhdHVzIHhzaTp0eXBlPSJzYW1sMnA6U3RhdHVzVHlwZSI+PHNhbWwycDpTdGF0dXNDb2RlIFZhbHVlPSJ1cm46b2FzaXM6bmFtZXM6dGM6U0FNTDoyLjA6c3RhdHVzOlN1Y2Nlc3MiIHhzaTp0eXBlPSJzYW1sMnA6U3RhdHVzQ29kZVR5cGUiLz48L3NhbWwycDpTdGF0dXM+PHNhbWwyOkVuY3J5cHRlZEFzc2VydGlvbiB4bWxuczpzYW1sMj0idXJuOm9hc2lzOm5hbWVzOnRjOlNBTUw6Mi4wOmFzc2VydGlvbiI+PHhlbmM6RW5jcnlwdGVkRGF0YSB4bWxuczp4ZW5jPSJodHRwOi8vd3d3LnczLm9yZy8yMDAxLzA0L3htbGVuYyMiIElkPSJfZjk0ZTYyNmE1YzNhOGNmYmMwYTdjMTc1MzEzYzkzNzYiIFR5cGU9Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvMDQveG1sZW5jI0VsZW1lbnQiPjx4ZW5jOkVuY3J5cHRpb25NZXRob2QgQWxnb3JpdGhtPSJodHRwOi8vd3d3LnczLm9yZy8yMDAxLzA0L3htbGVuYyNhZXMxMjgtY2JjIiB4bWxuczp4ZW5jPSJodHRwOi8vd3d3LnczLm9yZy8yMDAxLzA0L3htbGVuYyMiLz48ZHM6S2V5SW5mbyB4bWxuczpkcz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC8wOS94bWxkc2lnIyI+PGRzOlJldHJpZXZhbE1ldGhvZCBUeXBlPSJodHRwOi8vd3d3LnczLm9yZy8yMDAxLzA0L3htbGVuYyNFbmNyeXB0ZWRLZXkiIFVSST0iI182OGIwOGY4YjlmZTRiZjYyYjZjNDYwZWM1ZjZiZTU1NiIvPjwvZHM6S2V5SW5mbz48eGVuYzpDaXBoZXJEYXRhIHhtbG5zOnhlbmM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvMDQveG1sZW5jIyI+PHhlbmM6Q2lwaGVyVmFsdWU+WDNKMHZhQkZWZ3IxWjFHNXBuV3ROR1d4aWN4cDJtOE9ZU1kxL0tsSFlIMWxucEQyMjJnT3V4TWlna3A5LzU1RkxvZ0JWdWNLaVRYcCYjMTM7CmZqMEFhSGoyTjlmbE1QZDNKMm9PQkhvaGhGOW0xakFsb3N3MmtvYldJZ3YyRjJKN295OVJFaE5kOWROMEtiMmFFN0RLMVNhNjhmalQmIzEzOwplLzdOVHJOaFJRQXBQY1ZMU0JQZFlNbmJEU3VJQUxybmNqaU9ZcEQzcWU5R0lod2xGNTZKVVpWTHVwd0Jld3JJRkUvZ1JJY3NqeDE2JiMxMzsKYWk5VVlmTzl1eFNQUDBjT3lUUHdWaDdwWVNrWXhSc0VOaUgyUlVwelNSUDdndVVEaHNUY09vbjlsQ1REYThuUXZxV2JULzV3OUtxNSYjMTM7CkczUjdOa0UvMG54VElFdlZKL3p2MC9Yb3JpY0hHZWZMcVhBa1pxZW44eGhpalVXS1ZRSURIeEFqM0VYNHNyN2I4NmNvYTFKNnFpaFkmIzEzOwpTMTk2LzBqYk90ZTRaNWViTEFDNENBdVY1SVZEaW9vOW81Yjc2Ulo1a3NDOG1XLzM1a3JzODA2Z3hKSGFzUytDdGI4SWQrdlM5djlJJiMxMzsKZnN3MHhaWWlwNjQ3NTd5YzYxbVVjd1pFUXFmZkV3TCtaZ2p6Z1M4R2kyOVZWa1hJZ25zVHhrbDdHYzVVYkVPcjY2SGowbk1EMDlOSCYjMTM7Ck1uV2NjMXpqS2ZtNk9Gb2ZZTjdzblFsczN6MzBvY0xocDhRMi9Mc1RCam0zNlBSbXJLdHJ3dnFWSE91VnViSnpzVjBaSGNwUHV0K24mIzEzOwo1a1FwOW9MZ09FVUQ4b1k4WUNRNHA4KzI1TTVUTHlROHppWlRISXlRZjRvU2RHS1NrUTNuOVg5Tk0vaCtYSllkYWprTjdKV2lpREFlJiMxMzsKbUNOVGl2QVFub2xFMzJyWXdqOHhDL3o1UmhmajROTXBNcW1LQmFCbm0rZDRYSExZektZNkM5TURzazFNRWx4WWFMcGczNG1GaEovQSYjMTM7CkpScFR5UmFJbVNHZ1RHUXpwaUV6dGlVMmhkUUtzTk8yYjIwM3p6dlp5dUwxVW9yc2hvamJ3bEJKT0xLSmc3R3NBNVhUTGNsNjMzaXAmIzEzOwpzaEVtcUNNNWFtZi9mSExQUHFGaWZqVmtHUEF2RWIxZy8rWG5DdG01MXY0VkxHQ2xMWlhPTWFPaHgzY3pTMmQ4UjZmaU5JQmVrc2dNJiMxMzsKSUVWR0tIeHMvbHVDQSttclhwWjFBR2JKbzZGbDZWT2hUVFkyWU5GcXRFOEc5QkFQL1B3UmI2NmRVRTNQWjdpRllUU2ZnN3ZwQWNiRSYjMTM7CnVlaU9lNVJLQWl6c0VndlVCNnlGS1d0QWRuNWpvRFdwZTIyZEdNTHUyZnRSZVJMNDZka3pXSkV1SkY4UG0vNFRnZ2UreGxZam44Rk0mIzEzOwpFQUJtNGN3ZmNDVjBtWEdBZ0FUYmwzUDJxZVhuRUYxcWFIdmhVMjk1T3VPa1lxMjIwc0x0dXBOQS84SmQ0U3dtVzhSc1hmK1dVbmlQJiMxMzsKODRpQWh3eW1xTllzcXNOY0F3ckk3ZnpBclhYSmx3Z0RMR2dUL3NiMklXbFhXSFVrTGhuVEJCbklZT05QM1liUXYzdnlUT1hzaHpmeSYjMTM7CjlzaEN1UGVncnh5MmpFeHE1WDh0eEVwbFljeisxUSt4RjhnOGlUNGV4SXg4dCtQMmd4eFY1WG56ZE9vSS9CZU53Uy9nSFFhREkrZ2kmIzEzOwplTmp3RTMrRDZLNTM4dTcrenJlMWJXL2V1cEFLcW9ENEYzWUMreEVrZzNtWWNGalBwMW1jV0pLSGNrQmtObDRvL0J0VHIyeSt5Z2JIJiMxMzsKRGFLZjh5Znk0eVNHVjg2enREUUhZb0xEQVc2eUhRZlF5VldJekhtOHU4dlhLTFNYazY5TGNlR2p0Qlp0UWhNdnFrc1p5R3ZMTkRuSSYjMTM7CkwzQk1DbElDZTFwbVdmQVdnZkVSMVBrUGNaOEtWS1dmNTBqdXJoMTZFYlc2Q0VXYWFhb3M0dVpUb1J0elo5SEN4dnBmWk9kZktNRFAmIzEzOwpjRXorN29RMWRKT1NEQWNGNnJKYU9iTW4rL1ZwUGI0Y3Y4czgxM3dBSUdSK2FMelhCQ1VmdnJGTmpVeUFrbTlMUEs5RS9ZUUdCYkZ2JiMxMzsKT2R4dzRxcXJNWENFTjM5MkJKaWpWZnFrYkdjeW9TYk9iUjJwbE11cS9NWUxkbnpkVFBROTB3NmkzWE1iVkFiQy9DRGF5aXVJUUdpUiYjMTM7CkdXOWwrQnVkNmpvL3FYdjVUNm9jVm0rNE9kRklFdmdwbEwxTXFkdlltcDN2b1FwNmJRVFJTeXFMdElOWEc4Qm1XdldSVm1Vdnl5Ui8mIzEzOwovMS9kN3BoYnl1OVBBY1k4YzNRcnk0YXdIaEI1bXlQMDFoeGlKMVB3Rm03U1pINzR4TnBZcFVFOElVdFRQencrYzh5NkozQ0o5V2tVJiMxMzsKc3pNUzluM1Jad2kwNHM5dWRtY05xTm9VcVZNeDBVYjJoQS92eXFrdnB0RFArU2NCZTdSaXMxTm4rRm1jcVQyaDdWckRBRlFHek1uTCYjMTM7CnlCbVQrSFRXaWZYSXJCdHptaW12MmNZZENIeWJ1V2ZaZm11SXdiRVdoVVBBQk1LZDlPT2tMZ2JIeFNVejRNVkV2eDlBdmFzb0h5U3AmIzEzOwpwWEpOdGRaa1ltN3dKd1RNNjdHZVZGUENXWHFtNVREUTR6SEUvYks2OTRFZzRIb29tWlpiMkc2Z0RBRHVvZWJYNnNIVXVBeStHWHQ5JiMxMzsKWUhNUlkyL24zMHJJWnZVeWwxcXgzd29DeThRVlUrRWR0c2RXZXF6cCs4MkFvdC9CWFBSSk14cEFycll4SitPVnpVUlphVlNhcFVzciYjMTM7CkFCOWxMeTdCU0N1TGx6Q0tCMzhielhDU0MyZ3d3SDRwekJMQ1F5RXQwNjIzYU0zYTlHeHk3aW5HS09Cd2lTOGJhUURZS05vZHpJWWImIzEzOwpDSCswQkFTKytKWXZMVFlmQm5uQkgzeXhmSmw3UWNYSG5zWlRmK3dRVldNZGhCNHZJcGl4amtkM3lwYzBidHkwRWVMeDFFNDk3U0FWJiMxMzsKbEkvdU1qa1B1c1N0ZlowN09GUkVraFZQT2h0U29LdGczb3JTMU5HK3VwQ042WlQ1MmRYM0RaajhRTGtZK3JiMVRYcFVxV09Kcy9jeCYjMTM7ClNyVitvNGE1K2RvUEUxOHp3K1VQRFVUMkNOaHdqd21QOTM4YnhGUGp3ZHRoOTlwRzlZTldkbXBDYkprb0FpWmhiSEJPaXl6NS92cFomIzEzOwpibHFueXhaZFErUWNpMDhhRUQ1ZUp1K3JnVkFNQ2tXNVBCd2JGYkFIWHFNVW5HYkhDOHdkbHdsdjF2cDJXK2xCYzh2aE9QdHhNZ0xmJiMxMzsKb0xkVUtFNk5KOUkvN01DZVcxaUw2a3lZTm56ZStDbWpUY3lnV1NDelllMUZueVRwdkl0NkJrdTI5RFhXc2lEamNTamZRSFRhOE1YZiYjMTM7CmtNVXZCL1dNODg2TUVIelhmMHBXTnhtVFdkMklNc0FleENuZk9LNVgrL0ZCWXo3UzNNamJORm5KV2FHOVI3cUwzUHdSNE5BYVNPQm8mIzEzOwpsNFdzQnJ1K1JObDYvemhackFwZ0RqZllzKzYrMlp3VHJSMDJrRkVUcnRhMFpNWThzazVIR01zS2ZjY3lDZVM5MG1tV1MrL2ZheWpxJiMxMzsKNExMV1JGN0NFNHREYVdScVdQK0JleXlDUm42UForSUV0TlNNeVUzWUNidEM5NVRqM0tlYTVMQWljUW5SWTJWdWdKSVJkMGhjT3pxOCYjMTM7Cmt6VGFFcGk1VXdOWHFJdStVTnRUeGc4V01aUHZvc3Z6OW5naVhsY09WRHM0Skd2K3FIVkk5NmpXcjU3NUlCRms1eGY2c1NHLzlwdnAmIzEzOwoyVDkyVHNRcUtoM3pVUVlIT2VuSnNUamhOMDJ3NTVraU41MWs2clJ0d2VJaVRzSERHMTIzSUlKNlFuQ0lpVC9XSVI0TkJqMUJoNnBtJiMxMzsKbXViTUVNTWFGK2lTZExXdXFaSlg5cFBrMmdJNVNOYWJlYjJZcGZKQXo2SlJRVVpJaWtlQ3RUVmJIa0hrdlFvWTZtdi9ObnJJb3orMSYjMTM7CmoxbURCeUVBOHRLQ21mYXhKcTFLbTVyeFBGeWVsTDV2Qytjc3hVYTVvdlliai9iT3A5bS9SQ1BiemtWYWNheENxekw4WDZzZVBvelgmIzEzOwpTNXBlUjdFUEhSNmg3a04xbno2QlRiUXpCa0FUcTRKeU5DcDdmSVVFNjNJWURra3lCRE44ZVRBUWdqU01VYkpRbWIrd1FzTlV1NUFTJiMxMzsKSGRpZHRoVjM0YnNYcmphemVHZEt1T2xlRXR2dGJ6eUdJMlJWd1N3UitCWFJ2RVFuTmZwLy9XUmNNdE0zMTFMcTA2eENhT2FvbE4zQiYjMTM7CmJBcGcrOEJ2bmVXZkUvd1pTN20rNE42bHA4bkxoemcrbFB5WEFPWWlLa3h4TkI3VktrS0JFV202UGhTcHp6MFIyWHhYMGNnWkZIZTImIzEzOwpiR211MHczRk02YVgzTnlHN1JKdWlzUlhzTTE3N3lUckJyLy9QN3NwKzlpQnVINW84Rm1nYzNTRkpCbysxbVRvVnJWa0tsZEEzWGRBJiMxMzsKVEp2TXM1WWRISi9ZQk9PL0NPUmV3OVVZcXlOa1FhRTVycmtlR2RIdnNBZ3ljeHVvNnFoVDJiM3cwZlhTdURMbStOT0l1WG8weDhhciYjMTM7CjRGalRLSnZYQjhTS2RmeElCSjJYOGY5dVpORVY0OE9abjV3eEtUL1ZNUGc2MnFqdXgzTStucnp3T3RJdEVXSDZYT05MYSsrUWZGa3YmIzEzOwppcVJrRnZmbkNLK3pBNHJHRmhuSDlRUmJZRzRONnI1YzNsOENoZ0NWVGMxZ3JKbFU5S0hPZ3dTbzA0YkJOSGhiMWUvYmhqRGkxdkJHJiMxMzsKS3Jqa3pmL0JVeFNMZzNSUXF0bU90dFRaNzRXbUtWdkZiSDh5TGZCSWNya1RnK3Ira21yMFBycWZWRzdZU1gxcHA3cHNXMkN5N3padyYjMTM7Cm9oT2ZxenluU2hKZXBRek41MTFHVDBRVWJrc0RsaEU2WStoQkE1R0g5NjNHWmRxSmxPa3gyRGZCSG9EbEhYY21la0s0dCtablV3cUYmIzEzOwpPVi9wT3VTVGl4M0pUR0NOTEJiMTVaSlFDK3VJTkE1ampJYlFWZnpieFBWbGpWUGM4M1N3RmsrYm42Vk9DdTIvYTNUVlBjM2U2cmxoJiMxMzsKNVllWXhBdWtZM2FlbnVtUmEybGh2ZmFsZzBuYTFxVml3UjZqQkxpMUd1cG5jLzZtY0xJL2h0MmI4eUlzbm9GUEI3TDhwRzVQOFBRYyYjMTM7CnZ3Rm1Gcmh4bGdCbGVwakJ4MUNMT2ZmcEkrdHY2YzFVWHFLVGt4ejZ0OFliNlN6Umg2Qlo0Y3VCb3lwdU91Sndva3VCVzdFNHVETGMmIzEzOwpDdTBxOFBSQkdUNHNGVFdFRFJqMDREbE1FUDFJZytvN3ZuaXRyQlN1VUZackZHRm14dTZLZ3hXZkZzM1R4MFFiUW1BQld4QUtxKytEJiMxMzsKbGc4UXBUMk8wY0ZNQTdDYWZaUm5YVDFnYW1GbGRnK0dwVm55bHhaQndiN05mQ2NjR0d4NTB6bittaXVYcE5WT2VPSjB2VHVHVXFwYiYjMTM7Ck40TGxaVzd0RTg1U2xoSjJHYTg0ZGdQU2NNNXdoM2Jnd3RCSllOQkg5UjFXVDBrZGVkYVhEWjJWYVZiSEQzekRQNVI0M2didkhLTDUmIzEzOwpqWWxLOEt6b0ZIeTJ1Wm1kejNEdlB4WndMRnIyamluazNOanFXam01Z05MRVVEbDUxdSt4bGozVkRya282YWRUSU9DOTY5aUhQbWVTJiMxMzsKeGJ0c1hITER5VngyNmYwRzNreTFHZHk5RVRiL2ZNQythM0FKaXJXb2sxdkE5ZzhqNUM4NmhmVVc0RnMwWmZ3YzA2ZGtNb0RTZmo5dyYjMTM7Clh2NTZzamRYMXY2a3YxSnJoTjBjQVZMYmZ0L0hrM1E4OE5TVmVNdnhMaUdmd1pKZFB2SVVEdVNaSG5Xdklxd0Q1VXRqNWJNK1ZQd3ImIzEzOwpVeld0Y0tFOHg5MGVmQ0s3SFJLUW4xMjQ3VGViQXcvWWMwTmlraTFHZ0JKVnNFYzFLeDVOVFZFSUVZaDdCS0EvQkVwNEI0YVUxUGpNJiMxMzsKQmFzZHV5QWNpTndnbkpKbTZlZXhUcnBzN1BHdW9MSUdKVHg5cEtrN2ZOYnkzMVE0Wi9XTy92aCtobm1UWStBWDR5WEQ0NGZqWnF0YyYjMTM7ClhwNXpWRGpDNFFHckFhMmhKS1NXNTJDbFhlQ3lGMFpPamZEblNSTk14SEtueXIzbEQ2dkt5ZWZjVEt6VEQrMzJEdFZyK3U4Um4vckUmIzEzOwpCZUNqbXlaM0RmaG9yU3ZkZXgxYlovTUgveXFGTmZTeVJ4QXAvZGpvcHpENFRWVDI4aGlramRBUkpqUXZBaHZLWlNLZzBrbVVwVExyJiMxMzsKVmhaVXc3WmRPemM5Q0JObk90QmxCRVNra2NJZDI3eVpNbWRiWEMvcFhUMlBLUmppUzROOFZ6NFBSdHZHbTF4UXZ2MHZad2VsbEh3bSYjMTM7CjhkMytodmF5QWVoNWxLWGpMZHRHQm9xc0JVc3J2bm5leElna2d5cllSb2hWb3VSQWRpc1E4Qi9MM3lhQTZTbWxNYTVYNGxmN0JjRGMmIzEzOwpJbUEyQ29xVnFDMmY5bGUvbWs0cjJrMDJvbEkzd1BmU2dESTlSQ2g1bnVzZkpCdlVvLzdoNlBxMnExQysyZXA1ZnVsQnd3azZ1dU05JiMxMzsKbUtsTU9OMXk0QlRaVjVzVTMyZG9USVZlUDJuUUFZN0hHZU9EMG1VcllOdmdGNnd6N2VwaXZiT0Y0SFE1OTBqNG9rcTI1V25EdVlIcyYjMTM7CklGbnVPZXZIcXl6Q3ZEMFNGQUJwRmc5Q3BXa0o3M1BCcmRHZVczbldjd3JYQzJsTkw4bUVLMFdHcVg3NkFjdWsvcXpERU5OTW5oWlMmIzEzOwpiWHFvMm1XZEYrVEtnVE4rNllLZEg5Z092YmhEWDNhYVpLQXR2ZEtmSEpLeG8rZVA3OWgwdFB0b2xSM3dLa1Jpb3g4cWUraUc5T3hNJiMxMzsKTEh3ODZqU0ZPZ2JOaXU2RWQrWVMwenkxKzYwaTZiVEtzakkydHEya05CWjRNZTRSWDlNeUNkZXhhME11NXJ0Y3V6VDdsTHdUaWdxaiYjMTM7Ck16NHF5Vjd3emR5SzRldG5uU2h6RStGTmc0VmQxTldzeHA0YUE3TGpmMU90cXRnQ1NCZVY2dyt4RUc3R05rcWRZWG1SUVVZUUVFcnomIzEzOwo1N1lldmt0cXN6MnpRSlk3NnptQURVVEJkTytUNUc2TnZxTkdBR0pVZXlqbHFOWUV4S2FlTVZBTmdFUW5xemdwQlVhVUI1ZHRLKytiJiMxMzsKR1pJbFJNVi9mZ1JhWlBNQWxlcFFtRE5RMmVLenh4MUlRanJBYzRVRFJ4MXNzOGNKUXpBZndCQTAwbS9GNXFBeUJZNll5dFovN2hEcSYjMTM7CnFxZjNFTENTWWZsWEkyMGxQUmp4TUlWbWlRWGhVeVR2djJ2azVjQTdnckl5SUlnZHQ2MlRYcmlURTFLVnUyUWlrVDFHUWxBT3pKenAmIzEzOwpubitBL0VVenF4T1V5OFVIdG9jQW9qNHIwdXp6T1QwRnNVNTdJWlhIb1NnRDdCU3M3UjFKTk1jbDN0cmwzd2ZiWm1veHd5WWo2U2JvJiMxMzsKOUZ0Zm1hbXRteXBldm1ZZFlvMi9vTFJRU0tRUjBKMHBlVnpodVhoN2hJeUlHQVAzdk9uZWJhOGk2aFc0Tk4zd3drdHV5NE1EL0t2MSYjMTM7CmVpckdKTGRUYmh5a3daSTd2U3M2Z0lNNUJGQWRCOVZscW1pd0FDNEJEY2o5eEV6RTBjN0FDQklJQTBkcTVQRjRUZHhTeUxYQkdkWUImIzEzOwpPaDd4ZmNzS3g5U3d6QUZqTXhxbnFkSGZxbGtHdXdqanpmMlJSZmwvNVFNS0YvTndvSjNRZDhZSEt1MWdzM2RCc0tMQm5lUVNPYlJFJiMxMzsKL3NLTm4rak1adDJ6OEhlcXNMVFZBZGVBYW9JVlZPNWx6d2tTVDdaTEdBY1B1b2xHeTN1SUIwcGNzU1lrdjcxMlFWaXgzYXc0MW1xcSYjMTM7Cm16aUNPN0tkRnNVZkNMOTJ1ZzNGc2llbUpyank1V0pvOTdjaFV4L01VRklyU05iMk54bWEwOWU2dW9KUUFtMFR1cEY3WStWaHdwZnUmIzEzOwpXSERvcnlZYUttZFFHWi9lR3UzRXhoZi9TOVRFOFlqc2xHVHlKWXNkVHZhY2U1NTEzMDE2d1ptUy91YTUwazdkcUR3ZGEwZUR1RzhEJiMxMzsKRnE3OEU5SHFrQ1U4a3o1Z2NySG1EcGxJVHNFTTBtN2dqNTRZRlptSHVHQkZQTnFJV0J2MHNNNVI0S2hoZjUzZDZCUlBJd0RxVnc9PTwveGVuYzpDaXBoZXJWYWx1ZT48L3hlbmM6Q2lwaGVyRGF0YT48L3hlbmM6RW5jcnlwdGVkRGF0YT48eGVuYzpFbmNyeXB0ZWRLZXkgeG1sbnM6eGVuYz0iaHR0cDovL3d3dy53My5vcmcvMjAwMS8wNC94bWxlbmMjIiBJZD0iXzY4YjA4ZjhiOWZlNGJmNjJiNmM0NjBlYzVmNmJlNTU2Ij48eGVuYzpFbmNyeXB0aW9uTWV0aG9kIEFsZ29yaXRobT0iaHR0cDovL3d3dy53My5vcmcvMjAwMS8wNC94bWxlbmMjcnNhLW9hZXAtbWdmMXAiIHhtbG5zOnhlbmM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvMDQveG1sZW5jIyI+PGRzOkRpZ2VzdE1ldGhvZCB4bWxuczpkcz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC8wOS94bWxkc2lnIyIgQWxnb3JpdGhtPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwLzA5L3htbGRzaWcjc2hhMSIvPjwveGVuYzpFbmNyeXB0aW9uTWV0aG9kPjx4ZW5jOkNpcGhlckRhdGEgeG1sbnM6eGVuYz0iaHR0cDovL3d3dy53My5vcmcvMjAwMS8wNC94bWxlbmMjIj48eGVuYzpDaXBoZXJWYWx1ZT5kczM0VTkvUG5DT0NybmVxNjllRXIzRXorNDZyZS9JUy90ZmFLV2tiejJicGkvc2o1bUlPZWhra0J6VHRWKzAyRUhFYlNWNG5ZOU5tJiMxMzsKKzVuVjE2N3g4T2JvVUlNbkhCOFJQZUh1Z1g0R3BXRGhvcGErUmpxbDJPa3E5N2JDYTFTTm5XcWhpbHRIQzdKYjU2RHZXc2lmNTJVMSYjMTM7CmYvMzdKMGlodEtsbzJJRUF5YU1VanBkMjdDTWFyd3RKQmN5OHVnbld5bjJ3b296aG1TR01MNWV4VkpLcGRBT0l4ZkVlc2RtNGlzUk4mIzEzOwpMOFFaVlAvVVNiVlJheDRWc2J4UWxad0IrcFZLa3lvbzkwR3luMWJtYlBtOEhuNG5RZHMrMk1KRWw5WjEvdmRtbW4vSVR3cW93blNyJiMxMzsKTUJGSStVNlh4WTVzMC8yZ0ZUL0o0YzBJdEd4OTJ1MnEyT0tSMFE9PTwveGVuYzpDaXBoZXJWYWx1ZT48L3hlbmM6Q2lwaGVyRGF0YT48eGVuYzpSZWZlcmVuY2VMaXN0Pjx4ZW5jOkRhdGFSZWZlcmVuY2UgVVJJPSIjX2Y5NGU2MjZhNWMzYThjZmJjMGE3YzE3NTMxM2M5Mzc2Ii8+PC94ZW5jOlJlZmVyZW5jZUxpc3Q+PC94ZW5jOkVuY3J5cHRlZEtleT48L3NhbWwyOkVuY3J5cHRlZEFzc2VydGlvbj48c2FtbDI6RW5jcnlwdGVkQXNzZXJ0aW9uIHhtbG5zOnNhbWwyPSJ1cm46b2FzaXM6bmFtZXM6dGM6U0FNTDoyLjA6YXNzZXJ0aW9uIj48eGVuYzpFbmNyeXB0ZWREYXRhIHhtbG5zOnhlbmM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvMDQveG1sZW5jIyIgSWQ9Il80NmRjM2IxODgzNmYxMDAzM2NkZTZmM2YxOTg4YTY4MyIgVHlwZT0iaHR0cDovL3d3dy53My5vcmcvMjAwMS8wNC94bWxlbmMjRWxlbWVudCI+PHhlbmM6RW5jcnlwdGlvbk1ldGhvZCBBbGdvcml0aG09Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvMDQveG1sZW5jI2FlczEyOC1jYmMiIHhtbG5zOnhlbmM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvMDQveG1sZW5jIyIvPjxkczpLZXlJbmZvIHhtbG5zOmRzPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwLzA5L3htbGRzaWcjIj48ZHM6UmV0cmlldmFsTWV0aG9kIFR5cGU9Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvMDQveG1sZW5jI0VuY3J5cHRlZEtleSIgVVJJPSIjXzBhN2M4MzFiZWEwMDMxOTk2OTA4Y2ZhMzE1NTZmOGQxIi8+PC9kczpLZXlJbmZvPjx4ZW5jOkNpcGhlckRhdGEgeG1sbnM6eGVuYz0iaHR0cDovL3d3dy53My5vcmcvMjAwMS8wNC94bWxlbmMjIj48eGVuYzpDaXBoZXJWYWx1ZT5sUEJVTkpDdWk3OHo4T1BEbSs1ci9pUEJ4V1VKZTZsRGZnWWVvWVNmSVFDc2tkVSt4aFdQTC9JbTJBK0h4SElLeXEraFRRVXlpeWRHJiMxMzsKb0FmbUNqWjZTdGx5M1o0SGgvdGZzV2lBOHJCSGRRWHUvNGY3QVlmU3BKZlBtMU1DZ2hDTmxoU1NHWjlTVlV6RGdXTUtocW9jT3JWZSYjMTM7Cm84dlozM3hQQ2MrV0hoWmlDS1MrZzhMa01YdUZhLzJZVzhOUG14ODRtK1NidGNpd3ZPbHhodkh2YkRPbWJUVWpGRFg3L2VmdDBieUMmIzEzOwpDSDQ1YWJYQm91TkpWTVBLclZZcVlVSGFsSzErOVZRd0NuVzk4WmNkVTlGenFVdTlmSjkzbmdGbW5SeG9PelJqeUZ4UlBKd3RDTU1QJiMxMzsKaTRLQXM5N3hpb0czMm02SkxFSGp0MjduTmhaM0xHSU9JcHdQMXZIRDlwcDFvMXdoOGp1d1pRMkNQUmxobStMRmVuck5SUVRURkdySSYjMTM7ClJYYnRhQTFCRk9SVmRRZnhQcU5lR2hlK2VSTGNRZS9HT1F6andhTHBDZkI5ZEgxbzc3cjFLZnBoY09XaU1OTFVLem8zUjEvVjhMb2YmIzEzOwpsOTRsbW9iQ05JZVlFMUxJczhqOVNnVUNNVVRmSEhZaGh5ZFZXR2d0M3RrcWxrNm50b1pjajN4Z0VCdFNkSjZ4UFFTeWQwbnBwVnVsJiMxMzsKbWdLNnBVd1hQcmNZUVhCNmJ6d2dUYlpMTndjN2xwY1lnN3ByVEt6Zkp6dEVSUGVNOHprS3o4YkRZS1hyT0lHckFFOGtHOWtFNFZHRyYjMTM7ClAxak8vbnMxQkZoUDNLeXdxeHF4K0ZHTnR1Y3E0QWFRNFNhZXZBMXd6eENTdlhNR1RWUHVGei9sRXdxaDZlSEhEMHJ1cGdweU1nQ2wmIzEzOwpUemNkb3RRY0phKzRESzQ5WTgrS0tVanJRL0Z3dmtwSFdtTkIzWUR0b0dYaDVvQS9vY1RxVm5SUmRCdFE5VlV1Rys4SXJWNnZ5K2JwJiMxMzsKaFVXRG5aSktCTGlHeU5rUlQ4OWMyd0xHSTQ2Vi9ldm9aeENxMkE0M0lPV0ZrckdOYSs3VVdtcDlOL1VvcEo0NDdvQysxRWxYMkNlRSYjMTM7CnJEazJtbFhUSjMzUnE4RDF6UDkyQ21Wbkt2c0k5dmw4ck1vdzZtUmhzcDVvODg3R3JOWkQ0RHR5aHd4a3IxTDNGOUNDd3YxWk1UWWYmIzEzOwpsaEg3RDhKMkxYOGN0eTg5UDcxaVVaQnByaWk1Vkp3NFNqUVJCeUFhOHBob3UvOWVnVm5zeURUNDlMZUJrZUNsSmE0QlRrV1U5elRPJiMxMzsKZ3p2ME0zNUVDTG9USlFHSnpPSzdBUjF4YkIyM0xBVlJIS0g3YTBrdHpiNFBpVjlubXZ0K0NQREN0T1dZYXNxcTRuTGlVL3ZRU0RCSiYjMTM7CmdZcDY5RUdLb0dnTlBld0F0Qldhb0pXWmNYS3RuZzFnYThBODlRSUZ4NjdkVU9FS1FaY2dvNkhlSmczdkNoTjZXb1pmc1BMTFM3TGgmIzEzOwpPTjJmQmlmbnBMNjVHckxycUJBdElZTWQxc1N4YzB6UXB0MW5rYmMzZ0l1UjdKU1hsOU13M0doVGFHNzE2OWpvRzRkUVV3TlFOTVBZJiMxMzsKWWN2L3lxRmNzWlU1VG9XOVN0RDVVQ0hoMmhnRUF6bkwySDJQbXROWHlKcjE4ZVpJVGROWVh2bHNnSUVuZWZKZGY4bGpBQmhleEZoVyYjMTM7CmhFaytZNStyY2lMUkZYbDE1UGZlL2lvUndwZUVWcktFUTVXaENxYU1GZXFYYXBMb1E2QkFQV3RRelZqYW10NVFWYWI5L1dyWTJidkImIzEzOwppNnJOM0xjRk5HRkpDRE4xb0JCQkxwenJvUWJrSWFyZkN6ckE1MHlnUHhKK0lBSWhPZS9lR3plaXBWNTB3NWZtZGNQaGsvRFJGN1VLJiMxMzsKbytFaDZsR1pORjhrbGx6Qk52enVvaHNSVFNQendFR0djUnlaNFgxdWJZZFgzVS8yaGM4cjR3d0xKY0hDc3E0ZFAvSHp4UFNlcER0YyYjMTM7Ci91bWtWdmZwb1BxSXJQaHBEaG8vZWdPaHplL2NPbVJjdUM4Z0l3YVZPaGxJYllxVHZEUkwyMHVWd1A0NWZUd25JL2JESzhOaU5LRDgmIzEzOwowalo0d2tDaEZuazkvTXdHS3FuNlZ0N2RaNm9KbFpjb1krVkZtR3lFNmcrM1k3Um5IV0srUW9mdC85KzhJbG5kcDRRalVUcnlCdm5ZJiMxMzsKQkE3QlBLek9RSDdBSERFSFVuVVVHeStFbERmTWdQWS85SnE4dEdNT256WkNKK0pGM0hJV2RkeUNWdjN0WWFDZDZHWmRJN1ZaMGtvYyYjMTM7Ci9pL3hpcUhSVDVIeEwxS0ZuV3RaTFBLQk5ta0FJUVBuaFNZKzQ1TUtWQ0FaU1RFL2FITDU0Sm4xaXh0OXNtUlBRM1YzemtJTXhZUGcmIzEzOwpzWk9WQ1JRNEY3Nlc2b25ITjhzakpxUTJjb29lSjRGd1luZk5VUGRXZVBsNUlPVm9KaUdMNVVvUSs4MkpRN1FtMUQrdmJ6RFVzOEZkJiMxMzsKTml5Q2ZBbHEySE12dmo1ZW5SSFovVHp4Q3BnUVZHeEYzeDBWWDFDU1pqOXJlVVdRUU04eHBhTFRnb3NPYVZrZ2NibTZIazVTTUJkTiYjMTM7CnJQRGx3alZ6c2h2OHFFUjV5Z2huSDRRTEpDT2ZPc2JwcU1mWU9hNVdRanF5d2dMY0JLVW00aVNPZnFjWGp5WU9hNkdDQUFOQmJwNTgmIzEzOwo0NTFDSHdIa2xFMWFxcEdGUlFHMGFxNnQ2bEN2M3p4QTUyWXZoOGlCalNET0RvRHpKWnd4RjRuTnA0MmF5Z1BHMEF1SkRGelNIbzZsJiMxMzsKUHNnNklRQU9hSnRVQzhyT3pWNWlOVkd2VnRZR09VMmREbSt5Q3l4MXo5RVZ3bDVUZTRrYmxBZEcrQ2NBalhIY01CNnYydi9meXNlQyYjMTM7CjluZUJ0M2xNbUthdUdObGZ1V2RDRzB6NlU4Qi9JbHlOUjBDSW9QTWZmelUvNXFNMzZSdlFMY0Z1b1FwY08zSzlxK3NkTnJNZFhxUkcmIzEzOwpNREgrUmZsMEpWVlRtOXRoL2t4WEJhNkdDMlFwaHB0WVIvN0pFNFRLaTJUb0JpUGlrU041SFRZMStZVkI1M3hDd3RVVkt1Y1RjT1c3JiMxMzsKOWs2RDNJZHhWNmJIWHR6dkk1cXdodDFKNEFoczJZbzZDTGozMEVQN1kwS2cxdGp5SC9kbDRMZXc5SWdDVkdHYTZHS3k2aEpxd1MxaCYjMTM7Cll4RFFEWU1oWDNJcW5OdnVzajhjUjZxYjFqTU9kam9BeENQMXZIZFp1blJydFRFTG1jR3FRaEZWVU40WGVmNFM3cW4zQmRlZmVvdUwmIzEzOwpLM0dWbG5EUkxDNkV6SnNPS1lON0lRbmNVNU85Ti9hSU9EN3RpWWpCc3UvNTlvbmE3WGhPdUt1VlpKTkpYaGRDS2ZYbEliaEREVCs2JiMxMzsKcFRTNkZEeUpXYndFbFRNaDgyeEZtZ2ljcHJxeWFvVW5FeWNYeUt6QlZHWFhRWFNXYTRDaWZuaUZIcmR4YnZtZjNQNXRnSzYzazF3NSYjMTM7CjJkaXdIQmNSbEFtQ204em5rVjdvVjBmamVYYy9FV0ZlQmo2czRuV1pEd1J5aHNHbW94TVl2RlpxSG9OekRFUzdQL0c5Vi9OMkt0MlUmIzEzOwp0VEpEL292RExlNWZIOUhZWTVDZkZmWXJhZ2NTNEVPWmhVcm05cE02bkVCMDhsaEE4Q3V2dXNIb2lPZXd0MXZxUEZNWmYvZ2ZyUS95JiMxMzsKOC92SWZLcEJqTTJ4bDNWUUR4TXBXL3NhSjNiaGlRYW1QbFlEQmhTdkcwZE1FTGMzVU0xd0JXdDdNYnRKV1lwdTlhNUl1TVhxUXk5VCYjMTM7CjdxVTRsZUhiS3FqdFNSYkR3V1h0ZmJoYkdpRWJjQzlWbDNzalZSQW1NWWgwK1NBV3diRE51OG9FS2owUGpOM05MZGI5alN2MHpjR24mIzEzOwo1dys3NENsQ3c4OWRjRHE5Rk1MYXFzSDFUc1hUQUw5U09ZSmxmTWdWcUk5cDBKTm55UVI3ckV6bTk3eGk5TExQVHNRNk9qVkZvZVY1JiMxMzsKNXM4VTViQTY4dzlZNUpjV2RiSVhIZFVJcXladE5PU0hKM1F4ZlM3TEJHL1hzMUhnWmtocE9uM09ZVnhjN24xRENwYzkzMHZidWZDdiYjMTM7CnJubVhFNUhKaWFVV2RVY1FxNW01eGlPeWFGcVdwZ3p2NW1UTGhOcVY2dDhYVFJ6UGFCQzN0aTlqUld2dUoyTWxYOWk4REhIYkRqemEmIzEzOwo4SkpjT1JTU3Y2elNHZkpzZEZ3YkpLMjFyaHpTRGN0aVFVNW43NHZDV3hnaktzUWxzc0lJQ055U1ZkWGdQT3B0OTYzUTNGY3BQY2hOJiMxMzsKbnRIWkxDWnFhaHlCYnJ4ODcyN0l4cnBRSzl0dnBsNkltelBuMmJURmhSc1p3YjcvMUlzMFdqMGJUVyt2dFFwa2tJVEo1d1o1WUttcCYjMTM7CndZUGdkcXEyRktZWVZiUFdhTjd0bHlrbERZYWpnV0dzUytuMVdVaW9mNHVyS2NXNTJtMStwYmFqRjREZ2ZlQWIzYWJsdGYwdElubnYmIzEzOwp2UjhQWGFlY3hWNXYxVU8vTklsTk1ua3ZhaWFpUjNrN1Q3bFpoNU5EaU0rZ0gwQ04vK3lqcHBHQ05idWtXRXRUbkVqTTVOYytZc05EJiMxMzsKczlwRkdnMURDV0lJSG9GdzBUUWlTdDMvTlZtWXZOOGdKSnVneDNRNE01QnhiZThGUTl2N3RDT0xhU2tNdFJacWVFS05UeHFyYStpRyYjMTM7CkdMRmtubFArdS92MDhaalpRbHZCdjlodDBDR3M3SlB0THNuaVJuUlB2QnM4UFZYazBhU1hBMHRXY1hwSzAzRTVsaXY0S1p1SGhoeXkmIzEzOwowR2Q3Smw1RERhQXZONDc4Tkg3QzJMenk1bnlZM1VwT2dKcEJ0dC9pTStDM1dLbTVUaDhkRnJSL2VIc2F6Ylo1NGpKR1JKdHZ5RHkwJiMxMzsKLzVTMFk2aWp1c1hseHFRVDBZcmhrMEw5bVpuOTAyc2twNXk5ekxLZ2J3bHErUkE0ZER1L1hRbDVuV3FLT0h6UzA1WU5CYklQb2hJNCYjMTM7CkVJN2RRT2NCRDB6NWhSR3UzbEtzSWlHZXBOZHBuNTVYbTBBYzlHNWdlb1BWL3JLMWdPTzF0N0tlcE1xMHNkN0FjSFdaUDJZMG8yRnMmIzEzOwplSzZBWVlmZ20vYnJwMFIwM1U3YVRpbDBSOTlCalJjVkxWb1B0cklqY1JuYmVZRVVtQ1UzWHBWMjluNUd2S3V0WWhvSEVvbDZGMWRqJiMxMzsKWGJSN29oSW9INEtvL2Foa29aTi9ST3cxazhPd1ZkK1o0Ykw5Qld5dzhySFdhNHdGc0ROY2ozL2RNOHorMXZaMlZhNDlkMkZYcEd2VSYjMTM7CnU1cGVhNHdJcnJ3YklHanJNWk1kK3pkTWg4ZHFrUmZzeEhuMkF1L2NSNE5CVWJZdTNTQUlxT1lXTXA1Q3dtMDJ0SWxZQUZSN1ZsVEYmIzEzOwpBcG45S2NabDBNTTRmdGVra3dQeVFxU0ZDRWJtdzhtSDlLNlJmMGVFUkZmNHlXODBsOXNsTlhOaE54TnJ1LzhsNzJORGZKMVQ0aVpSJiMxMzsKcTFYMGE1R2NxVXkvOHRlZnZWeUJIMXprQTFQbXpNRjVDeE1qTUF2VXpTTFFnWHZyTWJueDI4U3J2VW9oVTFnT0VHYjFyZU1HVkYrTiYjMTM7CjY0REl4VzJiQVhsVUpyR3I0TUw1cllSY3ZzMGFNZ2pPcW9hZEY2TVFrOWxMOElCemRMaGtNZ25UNWozTnY2SENaYXV1RnoyUitCNlgmIzEzOwpNWEt0SklMY01sOXZMV1FZV3FVbmlnbEQ3VGREK2ZjSUZ6a2NQbjVJU1NOZ0VDUTFENG8wdTAxeEtGMDR5UnRWZlBIdFJIRmNZclJVJiMxMzsKcDFNUzdvVEl0bHI4UTJCWHZqK1J5a3YyZWdlNElEZlpkMW00ZmVRQ2IyNUwzQVN2aWRRMWhZbDhDUVJGNmx5ZVVIbEVYVzdncEk4NCYjMTM7CjZ1clNaeUxWZFJ0dVRROG9JQ0wxRjZJUE1zOGx6Ym9MK0V5ZFdiM3ZTaGwvQkdxd3dOT3UvRURKWmhCbVkrdjZQL1N0Z0hxU3c3UUgmIzEzOworeCtEM0M3azZXRWE4ekpVdEVJZ0F5VDNuUzhBK21XWHZFSy9MWE9hb2xUN1NYbkZmaGVUTlpMdzh3NmN5Q2lmQzZRRjBDajJsVHNLJiMxMzsKR3Y5UGxRUmppRzNRODZyRWJyRGFia016ZEtHU1lUaHBqalNjTEsyS3A1UWtQZlpGOVhwMFJQdGdDSy9lTVh1N3lmZFYwcFVnSHk0cCYjMTM7Cm83ejFDM2ppL1dQYW9QTDhyUG5EU0hjRDRLa2toaXJnOEJiV1lERmtlMFllSWRGUXdHcWl0eTJqTE5nSTJORVRXdUdFSzU5K3l2WVgmIzEzOwoxc1NERnlCR1BLcW01Y1M0Q1ZsNm1ZdHdFdHZCdWhsQWg2MzZsRWYwZTdTcmdLRG1JdTF5N0p0U3QrNlp2bG5BdTR2YlY4M3VLbUFpJiMxMzsKTXY3aDlZK1NGcW4reTF5bVdFQThVSW5LdGhabVhYdmpYeHk4LzV4d1hBdHZmcVZTWDNXczIxRk1zc1FFREI3R0ZIR2p4d3RGOHVrcCYjMTM7CmtFU2xTSzlJY1BtQUpNSjRJeFNxRWdidjBqeGlvbDdJRlp0S1oyRFhxa3pHc2N5U1dwckQwMlhSdFg0SnprVE81RlNoTUFtazhBUkkmIzEzOwp4RGtSSkdvNzJrMFYvbGhSeGl4clBCYlpWTE5ibGF2UUtaQmFKM1FGaTgxMW5vVVptWGF3SGVGd2MzV3lrTUN0M0RVOFZTQzJ2QkNIJiMxMzsKcG8xWW5qL2R3MmU0YnNieTFvVFBLNTNmMkVSb2dtMC91S0xScnE5OFNPM0hWTFljR3JuV1Y1L3YyMTdpY1dmeDR2bmhnM3NicjYrSCYjMTM7CkZZRDdWcnh2UnlHMVFnS01YRHIvWWdBZkE4OXV4ZEpORHZUbkIrS0wvSGRuRThQZmorNmw0NHNWNjNEK1lSaldGR1pRalF2Nm5oVVImIzEzOwo4SHBKdkNaVjJUMkJjWUtoVWJ3QU5QL2M4YUZRR2VQV3FLSmg5NXJEaTJFSzdaVnFRL3NNUUVHQ0UvRzQ2Nm9DNGU3b09PSk1VMHRJJiMxMzsKOThqQ1Zpc0RtNnYrMU9CakpXcXlWYjZNMytkTkNJdFRtYm1rYVZST0tDWTJqL3IzMnMwZmZGa3gzL3dnWnlTN2syVHEwU2NHNE5CaCYjMTM7CkNCMngzYnZXNDlBajVQR2dSQ2NlL0RlY0RobWtvWGd5TWo0bzlDOTBVRUIwRHd1eDYyM2h2dTRpenhqZ0Fpb2ZMQ0k0NGNWMWZ6U3QmIzEzOwpWbmRBL20reFBZdUpzTTR5bGJUaTlweHo1aW4yTld0RDRwb0docTBMVkVlSDg2WnBER2JZZEhubEFZN0RGMWxUbFFhWkE5dHUwWU5lJiMxMzsKc0JRa3lZVG54cWpsMmZ0T0FBZEFPS0tUdkU4ckVBQUxJV1drSnhKeUJOZFlNZktRQ3EzU2NZZjl1eWZEQkpObmdWSSsxclBjcjRCNCYjMTM7CjVTQmM1RmlWVzk3WklzcnJSQUxYbVlUOVBmNG8xNFJtQWdFUlRTVVI1and6TjI2d3p6aE5KOWx2bCtvcWZGdWc4eDdubmFHVERHOHgmIzEzOwplbTlBWlJlZk43MkdCYkJQN0dmS3JtZ0VDNmlha2FrZVNlOXBkUnpiQk9iamQ0SW4xVnV0Nk5jQmFCQkdzbGtXMnpwK3lCbkEwWFVFJiMxMzsKbHZEdnd6eERlYUFCQWFYa01QQ3hmOTRxTXhtTHFoUExJRE9CckN1Rkt6a21MM2orMzdCYUJBTEZsc1hrdzIzTWtwSlNwZm1UcmMydyYjMTM7CjB6M0h1YU9aUkdrM3pLVTVuZzhSczIrZkkvbDFvdkxEeEZjRmt2TVg1WjZxVHFNZ0Y3ZGEvWTFRRmk1a2x5Y3dXUFFBY3hnczBuY00mIzEzOwpWYUxNbHlScDVNaC9CTURhVDU2cFNrNDZZUmV2NytkTGFuQ0RkMm1vQ1AvYkp3M05CWGRTUHd0Tzg4cTFyODB0RktxSFVEci8xVnQ5JiMxMzsKUzh4WFJZblRnTStNZTRjRXE3ZDkwbGRLakpBQWhMSEFySm4xcUJuTWdDMFRic2FEcU1yN2Fsd2xiUU44UGNyMmxRUGxkZkVTMzdzQiYjMTM7ClpTZzQ5aTJsRmdaRkVXemthOGxuVmFpbnhBN0V5RFordWRKbDErNGgybUFpZlJtdmdvMitFd09HSVdFTndOUlhRT3V1OGJwaVlsT2omIzEzOwpvdG55b004OEUvNHo4ckFCTm9YNU0zcS80a1V4dkZsdC83c0VIZWFYVEo2RVZGYXE5ZkVQVDlodThyY0Frd1JqUUErMlVqNEZhNnpkJiMxMzsKZkNvSGEyckFJbngrbGwvc28vQStuYU9rQzlaOWdCSGY3ODR0UExDNG5YY1p1SmFyWUlYSTA3V2swQ1N1dDhYa2taTlN6S0pSLzQ4ZSYjMTM7Cmc0ZE91emVsa1p3MTBVMVI2VUkzRjRFbzlZeDdrOU5Vdm1nYkJYSnVOcGxWQkk3aFFCZFVYSmZPV0JtdUM5Smh4WEU3T3d6Unl2d1gmIzEzOwpXZ29zM092QjlOSm9LTW9aSmsxTVg3ejJKY1NaM2tpU0lHUGJGb0tONlVQSUc5VFJwZTNDdzJNdTVocWNvQW1FUTNIV2g1aHpadjlDJiMxMzsKeTM2NWxaV3pNaUV3M1BrWXFNKzJ5ZC81T0p6WFM5YXlQQnI0Rm53WTIrdG40OThjeGc3VHVDMEJmci9kelMycC9hcjJ2dERodFBNaiYjMTM7CkNmRXl2RFIwVUVKVDZqSlFKZU9FUWpBa1RpLy9CZDBNTk8yZnJYbmVJR1ZseHZEdHd2amJETmtSemdhRGVzQ201TUsra1B3ajc2QncmIzEzOwpqU0xsZk94MjZ3djQvVDNlMjNmZUlQbTJZUzF0WTk5UFA5NGlkRkQvYjFzOXN4R1Z4TzBwQmRqczRLTDlqTTBwSmZKWVZpWEtHREVVJiMxMzsKcmNuMldKbUNIYTJqRVRvckxHMEdGdXU0ai9MR0dwYjFUT3A0dzVxbGV3Vkk0Y05GMlN4VkZzUXpxb3hrT1JlODNQWHRWWGxGeFVjcyYjMTM7Ck9UL09XWmZabjVPRDZybXVFbkw4YXlFTDBFSWFwWG5MVWd6c1lpS05JRnFTS1pxVXhWcTFxaVJKRy9ZVVNSZ1FTUmhMb2NsY0pnVGwmIzEzOwo1QVE0ZkV5WVBBUTdpNHNrREc1WGhKUjNJRENYdFFLdXVwd3lieTFBSDNLdUpDSlQvdU8zTGUwTVg0Nk1QaU4xbzZsSC9teW5DYTFEJiMxMzsKN0dyMllnNGdwUS9wbzdWZEpzcUt4VUxKd3lqQ0NDM2dwYnlhSmRyWGVNRDQzY2NTY1ZFZG4zc2pGUlVFWk0rWU1WenhhOVlXd2NldiYjMTM7CjIvNjRCZC9PZTBjTHRWZ0lVK1FHRnduVFh3SERuWUtwd1c1ZUs4UXNkeVRSaE4rQ1ZsMTVBdlRYbHFxcFNjYjc3QWUwQllKV25LTWMmIzEzOwpYTW1hdjdKUk9ucG13VVh6ZmJ0eTVmYVppQ3lGQlA1dGxiRmc2SGFLUlpyMzhOMHVLaDhTbThGdkZkN2xsSnZDYUR1cGV0dTVzSVpxJiMxMzsKQm9DUkhRWDBMOERUSmlTSlhwS205UDV3aHdLYzNIRFV2WHBjVHZzRDh6aFhNd2lTUjlDYmxrV1MzaUo3QTdNcjNYbFVJT3h4Vm50RCYjMTM7CnZGZ2p2M2w1THY5UHJadkRXTmtIbHp5cFN0dnRHS1hjclFYWTQ3dkluN1BnRWp5VVZxaFlReDdlTmphWDFobUdPSjdoOFZ5b3NzeUMmIzEzOwo1T0QyRU82dnhpNFdYNjVmZGwwMmx0WFlVZGp6aEtiUlpQOWJwZjBsMGxYajVqM3RTQmlnOVZUK1V3dVpJODdJcHFkQWpDQXQ2K0Q3JiMxMzsKZ2RoWUs1RjhTMmRmNTJxb1hHWjdQV2Q0bHA5eVFSNW9NY01vbXdBMm9pb0pFM25QWHFBTmxqUlV4UjhCcmVaSUVKTzEvaGVyZkg5ayYjMTM7Ci9QL05SRThvY2phVGk5cno2eUN5Mi9GdGRTUFBDUFJrWnNGcEQ0UDY3U2llZlpaODhDbjBSRDhLMGM4YVIxYitjMDkrcWZBNHp4RGomIzEzOwpOUGJsL0x1TWw3Ty8yV0c4dVdwYTlEdUxHMUdyM3hvMzM0K3NpVzR6RlQvUlZrSHVKRHpKTDRhTnJDUjI2UTdpWElLVVo5SFBLWG9nJiMxMzsKem04RndMbWswR05rOTc4dUE2KytnNjVzNEYzUFh1NGVQeHU0UjNHZEpFS3pyUFBQdzF1YUROY0pNajh2UUpwQTAxMlFMMjJFTy9qaCYjMTM7ClJUZDVBZjNTNXdoNVEwS2NpeU9uL1o2SWRqNi9XMTJSOGN0N09uN01QdUpUajV0clRLS3F5aHo3Sm1YSEFucFcvRjZuOS85aW5vVHEmIzEzOwo0T2lBWW5UcnQzZXYxTXdwd0ZaSjFPM3RwNjJFNWVMZ3JRcXhJTCtjUk1mRjFVRnFzY3I0MFZWVktWT0p2S3BuZFo5aUh6cy9RU1lKJiMxMzsKakp2Z05vVlNFTWVLMGJXbDYwc3UwS3hSVm5LbXBQWHlxdHdndTRVTldoTVVkd2VLSDF6bUdNZCtTQ2paMkFtV0lud1dkRVNJMUwxdyYjMTM7CkRsYnpzZGdTaGI2bjB6OWlrSkRaKzI3dkhxTUlQdjI4R2tGUFlYVWs0TWhZVXlzTXlBek9TMTRuYTIwd1VxRmNtWS9SQUVNNXN5ZFUmIzEzOwpYY0NMbXUyNW05bit0RUZzekZNRzZYODJxMWk1V3VRVWhvRUcrSDlQdDN5a1Fsb3R4UEtSQmhXZzFvNEI5QmNONzI5NVR0b3NXMm1NJiMxMzsKSnExYTBQZXJ6ajM5Z21pVnJheHlwWUk1NThrSElMWlBhOG5aUWJpdi8vaG9tMjFWdEJpRXRjK1UycjduWUNlVEc1ZHdhTm5wMjUvdiYjMTM7Cmo2a0NIYis3dzJoT2N3TFMxRkVYdWhsTXJhQ0RjSDA3RnRjblptTGhaejdwNTl0bTdkR1ZmL2cybDY2ZTF5RjJxenlyVHFEU2NaaDYmIzEzOwowa0JCVmRvY24vckRFS2g5cHIyRUxsb1preWlpQUs2QkxDNGlnU1pXZzFMQzJUYncwVnRsbmVMT3V1WWthRVJ6dmRnbFlNRVExRHBtJiMxMzsKbDViTXBjcnNaQmdZR0NIOUxRV083dW5IQ05NTHhrZ2licW5pOVkwMWt3YkRKUlphRHpJMFdmTlcvSlh3Z0RkK2I2L0x6ck8rU0w3SSYjMTM7CjVrSUlxZ3RsVWgrUWNna2dPZE9ESUtDYWVJeG5Hd2lRRzRETWViSmhZVERPTDUvUXNKKzdpQmNiVG5iQlNnd1kvWExqeE5iN2hIS3MmIzEzOwpTMlR0TGh0enJBMHB0eTFTTXhyK1I2WUJacWJCM0VLVlVSZ2wxQll4QkJkSkRUZ2YzTWJkYXIzeHM2YnhYZjQ5NC82b1oxeXI4Y294JiMxMzsKcTBjVUFqMlN2bVh4YW9WcmxzZW9jQjJLSVRSTXhPT1VRZkl0cXNONXU2emlYZGd3Q0hvcVVIVWVnVEZhT0hRa1hUKzZJSkNpTUpnciYjMTM7CjhEVklPTGFqS3FXMjZ4UE52WnNVOCtmOXYyYVV3WkJ6K094amNuM0Q1TjRFWWxFZGIwVXhRZkMvTFN2b0hBYlNsNExYdFphVTljblomIzEzOwpDeE5DLys1NXgvc2pFOS96MGc2LzZhL0VXbU5LNTRRc1drbU1vM2hFdlU5QThRamk0S2U4MjBiU0l0eW00Smk2Y2RLM3dOZnM2am14JiMxMzsKMEFhNVpLZEZJVVk2NDRRU1BSOE50YVQwazlWbWkyM0k4aTdiMnRjQ1RsdmFSVTBEb3p5aWFrTVVpR25ZSzg5MUxSeHNXbDNiMTNJbCYjMTM7Cmg1VFZwa3lvN2pMRDZRVk5zVFRIYUpjNWRSeTVKY00wb2FHQ1RudkxPL1l1Yi9ObmJDRnhiS1BvdkI2VVJxVnJBM2txLzF4cVNRazUmIzEzOwovOWNsL0tiNmhMcmVLMmdCLzRxd0pBcHJwSXM2NURJY1B1MkVMRy9pMlhDWEJMZ0JKRFQ1NnhKK29MUEJtYkM0SWlGV09MTmhud0FCJiMxMzsKeHlIVnJzRnFzWnpKS205RGpFNmFUTGpMdC9DK3VYcTNVNkNGejRJbFV1Szg2V1JKRlpHUFhwd2MxL1N4R1RBeTZIaUdEdERmOXJXLyYjMTM7CkdVVlkzMW5UZjExR1FTbHhGL203bnFnaFBNc2craC90enlCNVJhRk1YUVl6WjYweGc5VWpzM3VUREg3N2h3SkxYTjF3TTRBTUpzR0omIzEzOwpZWjViK21uVU9CUklqYVhEbVNKZEs5ZDcyUTh2cGVpNnNHZ3FzczRnTEFEN2Z0OEsrK01DVC9pV0pwWGF6K0N2OU4wR3ZlN1BKV3N6JiMxMzsKWjJuQUptalBvVXNhbGd4UHo2ZkJQbCtJTmoxTmd3V0lRUDlxQTVjTnI4RHR0bzE5emVUaXVEeE5GRHlQbDdpakxVSS9pMUFiYlJmTCYjMTM7Ck84SDFvRXRZYVBsQkFXVHlVTVdLVmJNekhYN1FxeEk2c2pzZXp2QThIVTR4Ny90eXM0UTFBbGV4dXFUZFhuaUZkR3NKOEdoNzQ5Nm4mIzEzOwpqM2NDeGNLbVE1RlowdFZOaG11cWxSSGNXZWg3VFFCSEtEWHg1eXNXZEx3eEJoT2RYby80MElVMm52L3dpU1ZzSFJkcktrUTh6cVZBJiMxMzsKU2liZW83MEUvSURPTmxEYkQvRmVubHpFN00rTFo4L2xoUWF5OUdwYWtkVlFjNzJNV1F3MlE2ZzI1Z1FhRjVJRU1rRFhLOEZxZnlhSSYjMTM7Ck9rc3lURXFLL1MxNm0wWVh6N1hLTlcxRm9DUzBRclE4YXpyQUd5QzlWS1pPTTdxSjE4ODNZWG85cUxvMDZJejJUQ2RXVDc4bGdIb0wmIzEzOwovcVhWWUphSTRwNEFsVkVSakptRlJCMk94Mk5ZK2pieDNLbldXd245ZFZZMWJQVjh1dE5ybnF6aTFuMis1ZUJZZ3BQNEVIcXZ0UlFLJiMxMzsKY0thNW52Z1VRKy9VL0UyUCtYbXBPWjRkZ0xnMnJHK3p4Zz09PC94ZW5jOkNpcGhlclZhbHVlPjwveGVuYzpDaXBoZXJEYXRhPjwveGVuYzpFbmNyeXB0ZWREYXRhPjx4ZW5jOkVuY3J5cHRlZEtleSB4bWxuczp4ZW5jPSJodHRwOi8vd3d3LnczLm9yZy8yMDAxLzA0L3htbGVuYyMiIElkPSJfMGE3YzgzMWJlYTAwMzE5OTY5MDhjZmEzMTU1NmY4ZDEiPjx4ZW5jOkVuY3J5cHRpb25NZXRob2QgQWxnb3JpdGhtPSJodHRwOi8vd3d3LnczLm9yZy8yMDAxLzA0L3htbGVuYyNyc2Etb2FlcC1tZ2YxcCIgeG1sbnM6eGVuYz0iaHR0cDovL3d3dy53My5vcmcvMjAwMS8wNC94bWxlbmMjIj48ZHM6RGlnZXN0TWV0aG9kIHhtbG5zOmRzPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwLzA5L3htbGRzaWcjIiBBbGdvcml0aG09Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvMDkveG1sZHNpZyNzaGExIi8+PC94ZW5jOkVuY3J5cHRpb25NZXRob2Q+PHhlbmM6Q2lwaGVyRGF0YSB4bWxuczp4ZW5jPSJodHRwOi8vd3d3LnczLm9yZy8yMDAxLzA0L3htbGVuYyMiPjx4ZW5jOkNpcGhlclZhbHVlPlZxV2lnV0JwbERpK3NoUnpsR1IyUXlhN0twdjU3TjIvUHJJV0FYTEtxU0ZVdFlIdHNieXpRVUV0aFJoVzAvU00rR2phM1drVHMrNXEmIzEzOwpPeUxGQzRXdGRSbmk3UzlGa0tEVnZhNVVWdkpCWDcxVjFhYXE2dndUdnhUUGNvL3NNUVZNRlZBUGNpUVYxT3VyWkREZStUZXgxa3BmJiMxMzsKeXdDdEhUejUzNkFCandqQzZ1Q3cvUVU4UWtJMEc0YUZ0OHhxNXloUnBvZlBkekR4ZEV5Z2NqK1BhV25SSUYwVjFHRlh3b2EwWWpXRCYjMTM7CjJBNDFYZmgzd3ovTkpzRkVmSFdmcEkrNjZmc0JKOWx4RS92RHZERG9SUjR0MkFieVNiUy83a0ZDSDMwL1J5OGdqdE5YSDlLT0Yyd0MmIzEzOwpIZDd3MHdMOHZ1ZzRyNnQ0V3RoOWt0OXFaVEZhZUI1aXFId0J0QT09PC94ZW5jOkNpcGhlclZhbHVlPjwveGVuYzpDaXBoZXJEYXRhPjx4ZW5jOlJlZmVyZW5jZUxpc3Q+PHhlbmM6RGF0YVJlZmVyZW5jZSBVUkk9IiNfNDZkYzNiMTg4MzZmMTAwMzNjZGU2ZjNmMTk4OGE2ODMiLz48L3hlbmM6UmVmZXJlbmNlTGlzdD48L3hlbmM6RW5jcnlwdGVkS2V5Pjwvc2FtbDI6RW5jcnlwdGVkQXNzZXJ0aW9uPjwvc2FtbDJwOlJlc3BvbnNlPg==";

    public static String sample_eidasAuthnRequest = "Sample eIDAS authentication request: TODO - use a real b64 blob";
}
