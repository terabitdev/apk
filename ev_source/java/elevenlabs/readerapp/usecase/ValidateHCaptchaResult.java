package io.elevenlabs.readerapp.usecase;

import android.gov.nist.core.Separators;
import defpackage.f;
import io.elevenlabs.data.worker.SubmitNotificationTokenWorkerBase;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import sj.j;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lio/elevenlabs/readerapp/usecase/ValidateHCaptchaResult;", "", "<init>", "()V", "Success", "Error", "Lio/elevenlabs/readerapp/usecase/ValidateHCaptchaResult$Error;", "Lio/elevenlabs/readerapp/usecase/ValidateHCaptchaResult$Success;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public abstract class ValidateHCaptchaResult {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lio/elevenlabs/readerapp/usecase/ValidateHCaptchaResult$Error;", "Lio/elevenlabs/readerapp/usecase/ValidateHCaptchaResult;", "Lsj/j;", "exception", "<init>", "(Lsj/j;)V", "component1", "()Lsj/j;", "copy", "(Lsj/j;)Lio/elevenlabs/readerapp/usecase/ValidateHCaptchaResult$Error;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lsj/j;", "getException", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class Error extends ValidateHCaptchaResult {
        public static final int $stable = 8;
        private final j exception;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(j jVar) {
            super(null);
            jVar.getClass();
            this.exception = jVar;
        }

        public static /* synthetic */ Error copy$default(Error error, j jVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                jVar = error.exception;
            }
            return error.copy(jVar);
        }

        /* renamed from: component1, reason: from getter */
        public final j getException() {
            return this.exception;
        }

        public final Error copy(j exception) {
            exception.getClass();
            return new Error(exception);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Error) && m.c(this.exception, ((Error) other).exception)) {
                return true;
            }
            return false;
        }

        public final j getException() {
            return this.exception;
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        public String toString() {
            return "Error(exception=" + this.exception + Separators.RPAREN;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/readerapp/usecase/ValidateHCaptchaResult$Success;", "Lio/elevenlabs/readerapp/usecase/ValidateHCaptchaResult;", SubmitNotificationTokenWorkerBase.KEY_TOKEN, "", "<init>", "(Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class Success extends ValidateHCaptchaResult {
        public static final int $stable = 0;
        private final String token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(String str) {
            super(null);
            str.getClass();
            this.token = str;
        }

        public static /* synthetic */ Success copy$default(Success success, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = success.token;
            }
            return success.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getToken() {
            return this.token;
        }

        public final Success copy(String token) {
            token.getClass();
            return new Success(token);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Success) && m.c(this.token, ((Success) other).token)) {
                return true;
            }
            return false;
        }

        public final String getToken() {
            return this.token;
        }

        public int hashCode() {
            return this.token.hashCode();
        }

        public String toString() {
            return f.C("Success(token=", this.token, Separators.RPAREN);
        }
    }

    public /* synthetic */ ValidateHCaptchaResult(kotlin.jvm.internal.f fVar) {
        this();
    }

    private ValidateHCaptchaResult() {
    }
}
