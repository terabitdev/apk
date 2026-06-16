package io.elevenlabs.data.services;

import android.content.SharedPreferences;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.RemoteException;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityServiceException;
import com.google.android.play.core.integrity.model.IntegrityErrorCode;
import com.google.firebase.FirebaseException;
import com.google.firebase.FirebaseTooManyRequestsException;
import com.google.firebase.appcheck.AppCheckToken;
import com.google.firebase.appcheck.FirebaseAppCheck;
import com.google.protobuf.c6;
import io.elevenlabs.data.worker.SubmitNotificationTokenWorkerBase;
import io.elevenlabs.di.GlobalSharedPreferences;
import io.elevenlabs.domain.Configuration;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.AppCheckTokenService;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import org.json.JSONException;
import wq.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eB#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lio/elevenlabs/data/services/FirebaseAppCheckTokenService;", "Lio/elevenlabs/domain/services/AppCheckTokenService;", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/Configuration;", "configuration", "Landroid/content/SharedPreferences;", "sharedPreferences", "<init>", "(Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/Configuration;Landroid/content/SharedPreferences;)V", "Lio/elevenlabs/data/services/FirebaseAppCheckTokenService$Token;", "getCachedToken", "()Lio/elevenlabs/data/services/FirebaseAppCheckTokenService$Token;", SubmitNotificationTokenWorkerBase.KEY_TOKEN, "Lsn/z;", "saveCachedToken", "(Lio/elevenlabs/data/services/FirebaseAppCheckTokenService$Token;)V", "Lio/elevenlabs/domain/services/AppCheckTokenService$Result;", "getAppCheckToken", "(Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/domain/Configuration;", "Landroid/content/SharedPreferences;", "", ParameterNames.TAG, "Ljava/lang/String;", "Lor/a;", "mutex", "Lor/a;", "Companion", "Token", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class FirebaseAppCheckTokenService implements AppCheckTokenService {
    private static final Companion Companion = new Companion(null);
    private static final String PREF_EXPIRATION_KEY = "app_check_token_expiration";
    private static final String PREF_TOKEN_KEY = "app_check_token";
    private final Configuration configuration;
    private final Logger logger;
    private final or.a mutex;
    private final SharedPreferences sharedPreferences;
    private final String tag;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/elevenlabs/data/services/FirebaseAppCheckTokenService$Token;", "", SubmitNotificationTokenWorkerBase.KEY_TOKEN, "", "expirationTimeMillis", "", "<init>", "(Ljava/lang/String;J)V", "getToken", "()Ljava/lang/String;", "getExpirationTimeMillis", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Token {
        private final long expirationTimeMillis;
        private final String token;

        public Token(String str, long j4) {
            str.getClass();
            this.token = str;
            this.expirationTimeMillis = j4;
        }

        public static /* synthetic */ Token copy$default(Token token, String str, long j4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = token.token;
            }
            if ((i10 & 2) != 0) {
                j4 = token.expirationTimeMillis;
            }
            return token.copy(str, j4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getToken() {
            return this.token;
        }

        /* renamed from: component2, reason: from getter */
        public final long getExpirationTimeMillis() {
            return this.expirationTimeMillis;
        }

        public final Token copy(String token, long expirationTimeMillis) {
            token.getClass();
            return new Token(token, expirationTimeMillis);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Token)) {
                return false;
            }
            Token token = (Token) other;
            if (m.c(this.token, token.token) && this.expirationTimeMillis == token.expirationTimeMillis) {
                return true;
            }
            return false;
        }

        public final long getExpirationTimeMillis() {
            return this.expirationTimeMillis;
        }

        public final String getToken() {
            return this.token;
        }

        public int hashCode() {
            return Long.hashCode(this.expirationTimeMillis) + (this.token.hashCode() * 31);
        }

        public String toString() {
            StringBuilder r10 = com.google.android.gms.internal.play_billing.b.r("Token(token=", this.token, this.expirationTimeMillis, ", expirationTimeMillis=");
            r10.append(Separators.RPAREN);
            return r10.toString();
        }
    }

    public FirebaseAppCheckTokenService(Logger logger, Configuration configuration, @GlobalSharedPreferences SharedPreferences sharedPreferences) {
        logger.getClass();
        configuration.getClass();
        sharedPreferences.getClass();
        this.logger = logger;
        this.configuration = configuration;
        this.sharedPreferences = sharedPreferences;
        this.tag = "FirebaseAppCheckTokenService";
        this.mutex = or.d.a();
    }

    private final Token getCachedToken() {
        String string = this.sharedPreferences.getString(PREF_TOKEN_KEY, null);
        if (string == null) {
            return null;
        }
        long j4 = this.sharedPreferences.getLong(PREF_EXPIRATION_KEY, 0L);
        if (j4 == 0) {
            return null;
        }
        return new Token(string, j4);
    }

    private final void saveCachedToken(Token token) {
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        if (token == null) {
            edit.remove(PREF_TOKEN_KEY);
            edit.remove(PREF_EXPIRATION_KEY);
        } else {
            edit.putString(PREF_TOKEN_KEY, token.getToken());
            edit.putLong(PREF_EXPIRATION_KEY, token.getExpirationTimeMillis());
        }
        edit.apply();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e7, code lost:
    
        if (r0 != r10) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x012b A[Catch: RemoteException -> 0x005b, JSONException -> 0x005e, IOException -> 0x0061, FirebaseException -> 0x0064, IntegrityServiceException -> 0x0067, FirebaseTooManyRequestsException -> 0x0174, TryCatch #3 {RemoteException -> 0x005b, IntegrityServiceException -> 0x0067, FirebaseTooManyRequestsException -> 0x0174, FirebaseException -> 0x0064, IOException -> 0x0061, JSONException -> 0x005e, blocks: (B:14:0x0109, B:16:0x012b, B:17:0x0136, B:45:0x013c, B:46:0x013f, B:23:0x0055, B:41:0x0093), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r5v0, types: [or.a, int] */
    @Override // io.elevenlabs.domain.services.AppCheckTokenService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAppCheckToken(wn.c<? super AppCheckTokenService.Result> cVar) {
        FirebaseAppCheckTokenService$getAppCheckToken$1 firebaseAppCheckTokenService$getAppCheckToken$1;
        Object obj;
        ?? r52;
        or.a aVar;
        int i10;
        long currentTimeMillis;
        Token cachedToken;
        String token;
        try {
            try {
                if (cVar instanceof FirebaseAppCheckTokenService$getAppCheckToken$1) {
                    firebaseAppCheckTokenService$getAppCheckToken$1 = (FirebaseAppCheckTokenService$getAppCheckToken$1) cVar;
                    int i11 = firebaseAppCheckTokenService$getAppCheckToken$1.label;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        firebaseAppCheckTokenService$getAppCheckToken$1.label = i11 - Integer.MIN_VALUE;
                        obj = firebaseAppCheckTokenService$getAppCheckToken$1.result;
                        r52 = firebaseAppCheckTokenService$getAppCheckToken$1.label;
                        xn.a aVar2 = xn.a.f37986a;
                        if (r52 == 0) {
                            if (r52 != 1) {
                                if (r52 == 2) {
                                    aVar = (or.a) firebaseAppCheckTokenService$getAppCheckToken$1.L$1;
                                    sn.a.g(obj);
                                    AppCheckToken appCheckToken = (AppCheckToken) obj;
                                    String token2 = appCheckToken.getToken();
                                    token2.getClass();
                                    saveCachedToken(new Token(token2, appCheckToken.getExpireTimeMillis()));
                                    token = ((AppCheckToken) obj).getToken();
                                    token.getClass();
                                    aVar.n(null);
                                    this.logger.log(this.tag, "getAppCheckToken result : " + token.length());
                                    if (this.configuration.getDebugMode()) {
                                        this.logger.log(this.tag, "getAppCheckToken token: ".concat(token));
                                    }
                                    return new AppCheckTokenService.Result.Success(token);
                                }
                                c6.x("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            int i12 = firebaseAppCheckTokenService$getAppCheckToken$1.I$0;
                            or.a aVar3 = (or.a) firebaseAppCheckTokenService$getAppCheckToken$1.L$1;
                            sn.a.g(obj);
                            i10 = i12;
                            aVar = aVar3;
                        } else {
                            sn.a.g(obj);
                            String appCheckMock = this.configuration.getAppCheckMock();
                            if (this.configuration.getDebugMode() && appCheckMock != null && !n.m0(appCheckMock)) {
                                return new AppCheckTokenService.Result.Success(appCheckMock);
                            }
                            this.logger.log(this.tag, "getAppCheckToken");
                            or.a aVar4 = this.mutex;
                            firebaseAppCheckTokenService$getAppCheckToken$1.L$0 = null;
                            firebaseAppCheckTokenService$getAppCheckToken$1.L$1 = aVar4;
                            firebaseAppCheckTokenService$getAppCheckToken$1.I$0 = 0;
                            firebaseAppCheckTokenService$getAppCheckToken$1.label = 1;
                            if (aVar4.a(firebaseAppCheckTokenService$getAppCheckToken$1) != aVar2) {
                                aVar = aVar4;
                                i10 = 0;
                            }
                            return aVar2;
                        }
                        currentTimeMillis = System.currentTimeMillis();
                        cachedToken = getCachedToken();
                        if (cachedToken == null && currentTimeMillis < cachedToken.getExpirationTimeMillis() - 60000) {
                            this.logger.log(this.tag, "getAppCheckToken - using cached token");
                            token = cachedToken.getToken();
                            aVar.n(null);
                            this.logger.log(this.tag, "getAppCheckToken result : " + token.length());
                            if (this.configuration.getDebugMode()) {
                            }
                            return new AppCheckTokenService.Result.Success(token);
                        }
                        Task<AppCheckToken> appCheckToken2 = FirebaseAppCheck.getInstance().getAppCheckToken(false);
                        appCheckToken2.getClass();
                        firebaseAppCheckTokenService$getAppCheckToken$1.L$0 = null;
                        firebaseAppCheckTokenService$getAppCheckToken$1.L$1 = aVar;
                        firebaseAppCheckTokenService$getAppCheckToken$1.L$2 = null;
                        firebaseAppCheckTokenService$getAppCheckToken$1.I$0 = i10;
                        firebaseAppCheckTokenService$getAppCheckToken$1.I$1 = 0;
                        firebaseAppCheckTokenService$getAppCheckToken$1.J$0 = currentTimeMillis;
                        firebaseAppCheckTokenService$getAppCheckToken$1.label = 2;
                        obj = kj.c.j(appCheckToken2, firebaseAppCheckTokenService$getAppCheckToken$1);
                    }
                }
                if (r52 == 0) {
                }
                currentTimeMillis = System.currentTimeMillis();
                cachedToken = getCachedToken();
                if (cachedToken == null) {
                }
                Task<AppCheckToken> appCheckToken22 = FirebaseAppCheck.getInstance().getAppCheckToken(false);
                appCheckToken22.getClass();
                firebaseAppCheckTokenService$getAppCheckToken$1.L$0 = null;
                firebaseAppCheckTokenService$getAppCheckToken$1.L$1 = aVar;
                firebaseAppCheckTokenService$getAppCheckToken$1.L$2 = null;
                firebaseAppCheckTokenService$getAppCheckToken$1.I$0 = i10;
                firebaseAppCheckTokenService$getAppCheckToken$1.I$1 = 0;
                firebaseAppCheckTokenService$getAppCheckToken$1.J$0 = currentTimeMillis;
                firebaseAppCheckTokenService$getAppCheckToken$1.label = 2;
                obj = kj.c.j(appCheckToken22, firebaseAppCheckTokenService$getAppCheckToken$1);
            } catch (Throwable th) {
                r52.n(null);
                throw th;
            }
        } catch (RemoteException e10) {
            this.logger.logWarning(this.tag, "Device integrity remote error", e10);
            return AppCheckTokenService.Result.Error.TemporalError.INSTANCE;
        } catch (IntegrityServiceException e11) {
            int errorCode = e11.getErrorCode();
            if (errorCode != -100) {
                switch (errorCode) {
                    case -17:
                    case -12:
                    case -8:
                        break;
                    case -16:
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                    case IntegrityErrorCode.NONCE_TOO_LONG /* -11 */:
                    case IntegrityErrorCode.NONCE_TOO_SHORT /* -10 */:
                    case -7:
                    case -5:
                        this.logger.logError(this.tag, com.google.android.gms.internal.play_billing.b.j(e11.getErrorCode(), "Device integrity fatal error (", Separators.RPAREN), e11);
                        return AppCheckTokenService.Result.Error.FatalError.INSTANCE;
                    case -15:
                    case -6:
                        ib.i.q("Device integrity play service error (", e11.getErrorCode(), Separators.RPAREN, this.logger, this.tag);
                        return AppCheckTokenService.Result.Error.NoPlayServices.INSTANCE;
                    case -14:
                    case -9:
                    case -2:
                    case -1:
                        ib.i.q("Device integrity play store error (", e11.getErrorCode(), Separators.RPAREN, this.logger, this.tag);
                        return AppCheckTokenService.Result.Error.NoPlayStoreInstalled.INSTANCE;
                    case IntegrityErrorCode.PLAY_STORE_ACCOUNT_NOT_FOUND /* -4 */:
                        ib.i.q("Device integrity play store account error (", e11.getErrorCode(), Separators.RPAREN, this.logger, this.tag);
                        return AppCheckTokenService.Result.Error.NoPlayStoreAccount.INSTANCE;
                    case -3:
                        return AppCheckTokenService.Result.Error.TemporalError.INSTANCE;
                    default:
                        return AppCheckTokenService.Result.Error.FatalError.INSTANCE;
                }
            }
            this.logger.log(this.tag, p.n.h(e11.getErrorCode(), "Device integrity temporal error (", ") / ", e11.getMessage()));
            return AppCheckTokenService.Result.Error.TemporalError.INSTANCE;
        } catch (FirebaseTooManyRequestsException unused) {
            this.logger.log(this.tag, "Device integrity check too many requests");
            return AppCheckTokenService.Result.Error.TemporalError.INSTANCE;
        } catch (FirebaseException e12) {
            this.logger.logError(this.tag, "Device integrity check firebase error", e12);
            return AppCheckTokenService.Result.Error.TemporalError.INSTANCE;
        } catch (IOException e13) {
            this.logger.logWarning(this.tag, "Device integrity check io error", e13);
            return AppCheckTokenService.Result.Error.TemporalError.INSTANCE;
        } catch (JSONException e14) {
            this.logger.logWarning(this.tag, "Device integrity check json error", e14);
            return AppCheckTokenService.Result.Error.TemporalError.INSTANCE;
        }
        firebaseAppCheckTokenService$getAppCheckToken$1 = new FirebaseAppCheckTokenService$getAppCheckToken$1(this, cVar);
        obj = firebaseAppCheckTokenService$getAppCheckToken$1.result;
        r52 = firebaseAppCheckTokenService$getAppCheckToken$1.label;
        xn.a aVar22 = xn.a.f37986a;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/services/FirebaseAppCheckTokenService$Companion;", "", "<init>", "()V", "PREF_TOKEN_KEY", "", "PREF_EXPIRATION_KEY", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        private Companion() {
        }
    }
}
