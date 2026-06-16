package io.elevenlabs.player;

import android.gov.nist.javax.sip.header.ParameterNames;
import c8.a0;
import com.google.firebase.messaging.Constants;
import io.elevenlabs.domain.ApiException;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.exceptions.ContentLicenseException;
import io.elevenlabs.domain.exceptions.NotFoundException;
import io.elevenlabs.domain.exceptions.SubscriptionRequiredException;
import io.elevenlabs.domain.model.PlayerError;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import w7.a1;
import wq.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/player/PlayerErrorHandler;", "", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Lio/elevenlabs/domain/Logger;)V", "Lw7/a1;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lio/elevenlabs/domain/model/PlayerError;", "classifyError", "(Lw7/a1;)Lio/elevenlabs/domain/model/PlayerError;", "Lio/elevenlabs/domain/ApiException;", "apiException", "classifyApiException$player_release", "(Lio/elevenlabs/domain/ApiException;)Lio/elevenlabs/domain/model/PlayerError;", "classifyApiException", "", "throwable", "findApiException$player_release", "(Ljava/lang/Throwable;)Lio/elevenlabs/domain/ApiException;", "findApiException", "Lio/elevenlabs/domain/Logger;", "", ParameterNames.TAG, "Ljava/lang/String;", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class PlayerErrorHandler {
    private final Logger logger;
    private final String tag;

    public PlayerErrorHandler(Logger logger) {
        logger.getClass();
        this.logger = logger;
        this.tag = "PlayerErrorHandler";
    }

    public final PlayerError classifyApiException$player_release(ApiException apiException) {
        apiException.getClass();
        if (apiException instanceof ContentLicenseException) {
            return PlayerError.ContentNotLicensed.INSTANCE;
        }
        if (apiException instanceof SubscriptionRequiredException) {
            return PlayerError.SubscriptionRequired.INSTANCE;
        }
        if (apiException instanceof NotFoundException) {
            return PlayerError.NotFoundError.INSTANCE;
        }
        if (!m.c(apiException.getCode(), "insufficient_credits") && !m.c(apiException.getCode(), "insufficient_premium_books_credits")) {
            return new PlayerError.ApiError(apiException.getCode(), apiException.getMessage());
        }
        return new PlayerError.InsufficientCredits(PlayerError.InsufficientCreditsCode.INSTANCE.fromApiValue(apiException.getCode()), apiException.getMessage());
    }

    public final PlayerError classifyError(a1 error) {
        PlayerError playerError;
        String message;
        PlayerError apiError;
        String str;
        String code;
        String str2;
        String str3;
        String str4;
        error.getClass();
        this.logger.logError(this.tag, "PlaybackException: ".concat(error.b()), error);
        if (error.getCause() instanceof ApiException) {
            Throwable cause = error.getCause();
            cause.getClass();
            playerError = classifyApiException$player_release((ApiException) cause);
        } else {
            String str5 = "insufficient_credits";
            String str6 = null;
            if (error.getCause() instanceof a0) {
                Throwable cause2 = error.getCause();
                if (cause2 == null || (str2 = cause2.getMessage()) == null) {
                    str2 = "";
                }
                ApiException findApiException$player_release = findApiException$player_release(error);
                if (n.a0(str2, "license_not_found", false)) {
                    playerError = PlayerError.ContentNotLicensed.INSTANCE;
                } else if (n.a0(str2, "404", false)) {
                    playerError = PlayerError.NotFoundError.INSTANCE;
                } else {
                    if (findApiException$player_release != null) {
                        str3 = findApiException$player_release.getCode();
                    } else {
                        str3 = null;
                    }
                    if (!m.c(str3, "insufficient_credits")) {
                        if (findApiException$player_release != null) {
                            str4 = findApiException$player_release.getCode();
                        } else {
                            str4 = null;
                        }
                        if (!m.c(str4, "insufficient_premium_books_credits")) {
                            if (n.a0(str2, "403", false)) {
                                playerError = PlayerError.DrmAuthenticationFailed.INSTANCE;
                            } else if (findApiException$player_release != null) {
                                apiError = new PlayerError.ApiError(findApiException$player_release.getCode(), findApiException$player_release.getMessage());
                                playerError = apiError;
                            } else {
                                playerError = new PlayerError.ApiError(null, str2);
                            }
                        }
                    }
                    apiError = new PlayerError.InsufficientCredits(PlayerError.InsufficientCreditsCode.INSTANCE.fromApiValue(findApiException$player_release.getCode()), findApiException$player_release.getMessage());
                    playerError = apiError;
                }
            } else {
                int i10 = error.f36262a;
                if (i10 == 6004) {
                    ApiException findApiException$player_release2 = findApiException$player_release(error);
                    if (findApiException$player_release2 != null) {
                        playerError = classifyApiException$player_release(findApiException$player_release2);
                    } else {
                        playerError = PlayerError.DrmLicenseError.INSTANCE;
                    }
                } else if (i10 == 6008) {
                    playerError = PlayerError.DrmLicenseExpired.INSTANCE;
                } else if (i10 == 6002) {
                    playerError = PlayerError.DrmProvisioningError.INSTANCE;
                } else if (i10 == 6007) {
                    playerError = new PlayerError.DrmDeviceNotSupported(i10);
                } else if (i10 != 6006 && i10 != 6000) {
                    if (i10 == 2001) {
                        playerError = PlayerError.Network.INSTANCE;
                    } else if (i10 == -103) {
                        ApiException findApiException$player_release3 = findApiException$player_release(error);
                        if (findApiException$player_release3 != null) {
                            str = findApiException$player_release3.getCode();
                        } else {
                            str = null;
                        }
                        if (m.c(str, "voice_design_free_not_allowed")) {
                            playerError = PlayerError.VoiceDesignNotAllowed.INSTANCE;
                        } else {
                            PlayerError.InsufficientCreditsCode.Companion companion = PlayerError.InsufficientCreditsCode.INSTANCE;
                            if (findApiException$player_release3 != null && (code = findApiException$player_release3.getCode()) != null) {
                                str5 = code;
                            }
                            PlayerError.InsufficientCreditsCode fromApiValue = companion.fromApiValue(str5);
                            if (findApiException$player_release3 != null) {
                                str6 = findApiException$player_release3.getMessage();
                            }
                            apiError = new PlayerError.InsufficientCredits(fromApiValue, str6);
                            playerError = apiError;
                        }
                    } else if (i10 == 2004) {
                        ApiException findApiException$player_release4 = findApiException$player_release(error);
                        if (findApiException$player_release4 != null) {
                            playerError = new PlayerError.ApiError(findApiException$player_release4.getCode(), findApiException$player_release4.getMessage());
                        } else {
                            Throwable cause3 = error.getCause();
                            if (cause3 != null && (message = cause3.getMessage()) != null) {
                                apiError = new PlayerError.ApiError(null, message);
                                playerError = apiError;
                            } else {
                                playerError = PlayerError.Unknown.INSTANCE;
                            }
                        }
                    } else if (i10 == 2000) {
                        ApiException findApiException$player_release5 = findApiException$player_release(error);
                        if (findApiException$player_release5 == null || (playerError = classifyApiException$player_release(findApiException$player_release5)) == null) {
                            playerError = PlayerError.Unknown.INSTANCE;
                        }
                    } else {
                        ApiException findApiException$player_release6 = findApiException$player_release(error);
                        if (findApiException$player_release6 == null || (playerError = classifyApiException$player_release(findApiException$player_release6)) == null) {
                            playerError = PlayerError.Unknown.INSTANCE;
                        }
                    }
                } else {
                    playerError = PlayerError.DrmAuthenticationFailed.INSTANCE;
                }
            }
        }
        this.logger.log(this.tag, "Classified as: " + playerError);
        return playerError;
    }

    public final ApiException findApiException$player_release(Throwable throwable) {
        throwable.getClass();
        while (throwable != null) {
            if (throwable instanceof ApiException) {
                return (ApiException) throwable;
            }
            throwable = throwable.getCause();
        }
        return null;
    }
}
