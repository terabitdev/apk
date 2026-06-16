package io.elevenlabs.domain.services;

import android.gov.nist.core.Separators;
import com.google.firebase.messaging.Constants;
import io.elevenlabs.data.worker.SubmitNotificationTokenWorkerBase;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.usecase.ResolveMultiFactorResult;
import ir.i;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import rd.c1;
import sn.z;
import wn.c;
import zn.a;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0003\u001e\u001f J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H&¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H&¢\u0006\u0004\b\b\u0010\u0005J \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH¦@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH¦@¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0003H¦@¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\tH¦@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\tH¦@¢\u0006\u0004\b\u0016\u0010\u0014J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H¦@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u001cH¦@¢\u0006\u0004\b\u001d\u0010\u0011¨\u0006!À\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/AuthService;", "", "Lir/i;", "", "isSignedIn", "()Lir/i;", "Lio/elevenlabs/domain/model/User;", "user", "userOrNull", "", "email", "password", "Lio/elevenlabs/domain/services/AuthService$AuthResult;", "signInWithEmailPassword", "(Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "createUserWithEmailPassword", "tryAutoSignInAfterCreateUserEmailVerification", "(Lwn/c;)Ljava/lang/Object;", SubmitNotificationTokenWorkerBase.KEY_TOKEN, "signInWithGoogleToken", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "code", "verifyMfaCode", "Lio/elevenlabs/domain/services/AuthService$SignOutReason;", "reason", "Lsn/z;", "signOut", "(Lio/elevenlabs/domain/services/AuthService$SignOutReason;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/model/AsyncCallResult;", "deleteUser", "AuthResult", "ConfirmEmailResult", "SignOutReason", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface AuthService {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lio/elevenlabs/domain/services/AuthService$SignOutReason;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "UserInitiated", "InvalidRefreshToken", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class SignOutReason {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ SignOutReason[] $VALUES;
        private final String value;
        public static final SignOutReason UserInitiated = new SignOutReason("UserInitiated", 0, "user_initiated");
        public static final SignOutReason InvalidRefreshToken = new SignOutReason("InvalidRefreshToken", 1, "invalid_refresh_token");

        private static final /* synthetic */ SignOutReason[] $values() {
            return new SignOutReason[]{UserInitiated, InvalidRefreshToken};
        }

        static {
            SignOutReason[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c1.q($values);
        }

        private SignOutReason(String str, int i10, String str2) {
            this.value = str2;
        }

        public static a getEntries() {
            return $ENTRIES;
        }

        public static SignOutReason valueOf(String str) {
            return (SignOutReason) Enum.valueOf(SignOutReason.class, str);
        }

        public static SignOutReason[] values() {
            return (SignOutReason[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    Object createUserWithEmailPassword(String str, String str2, c<? super AuthResult> cVar);

    Object deleteUser(c<? super AsyncCallResult<z>> cVar);

    i isSignedIn();

    Object signInWithEmailPassword(String str, String str2, c<? super AuthResult> cVar);

    Object signInWithGoogleToken(String str, c<? super AuthResult> cVar);

    Object signOut(SignOutReason signOutReason, c<? super z> cVar);

    Object tryAutoSignInAfterCreateUserEmailVerification(c<? super Boolean> cVar);

    i user();

    i userOrNull();

    Object verifyMfaCode(String str, c<? super AuthResult> cVar);

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lio/elevenlabs/domain/services/AuthService$AuthResult;", "", "<init>", "()V", "Success", "Error", "Lio/elevenlabs/domain/services/AuthService$AuthResult$Error;", "Lio/elevenlabs/domain/services/AuthService$AuthResult$Success;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static abstract class AuthResult {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0083\u0004J\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, d2 = {"Lio/elevenlabs/domain/services/AuthService$AuthResult$Success;", "Lio/elevenlabs/domain/services/AuthService$AuthResult;", "isNewUser", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class Success extends AuthResult {
            private final boolean isNewUser;

            public Success(boolean z6) {
                super(null);
                this.isNewUser = z6;
            }

            public static /* synthetic */ Success copy$default(Success success, boolean z6, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    z6 = success.isNewUser;
                }
                return success.copy(z6);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsNewUser() {
                return this.isNewUser;
            }

            public final Success copy(boolean isNewUser) {
                return new Success(isNewUser);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof Success) && this.isNewUser == ((Success) other).isNewUser) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isNewUser);
            }

            public final boolean isNewUser() {
                return this.isNewUser;
            }

            public String toString() {
                return "Success(isNewUser=" + this.isNewUser + Separators.RPAREN;
            }
        }

        public /* synthetic */ AuthResult(f fVar) {
            this();
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lio/elevenlabs/domain/services/AuthService$AuthResult$Error;", "Lio/elevenlabs/domain/services/AuthService$AuthResult;", "<init>", "()V", "FirebaseGeneric", "InvalidEmail", "InvalidCredentials", "Unknown", "AccountBanned", "AccountDeleted", "AccountNotVerified", "FailedToConnect", "TooManyRequests", "MultiFactorRequired", "MultiFactorError", "Lio/elevenlabs/domain/services/AuthService$AuthResult$Error$AccountBanned;", "Lio/elevenlabs/domain/services/AuthService$AuthResult$Error$AccountDeleted;", "Lio/elevenlabs/domain/services/AuthService$AuthResult$Error$AccountNotVerified;", "Lio/elevenlabs/domain/services/AuthService$AuthResult$Error$FailedToConnect;", "Lio/elevenlabs/domain/services/AuthService$AuthResult$Error$FirebaseGeneric;", "Lio/elevenlabs/domain/services/AuthService$AuthResult$Error$InvalidCredentials;", "Lio/elevenlabs/domain/services/AuthService$AuthResult$Error$InvalidEmail;", "Lio/elevenlabs/domain/services/AuthService$AuthResult$Error$MultiFactorError;", "Lio/elevenlabs/domain/services/AuthService$AuthResult$Error$MultiFactorRequired;", "Lio/elevenlabs/domain/services/AuthService$AuthResult$Error$TooManyRequests;", "Lio/elevenlabs/domain/services/AuthService$AuthResult$Error$Unknown;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static abstract class Error extends AuthResult {

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/services/AuthService$AuthResult$Error$AccountBanned;", "Lio/elevenlabs/domain/services/AuthService$AuthResult$Error;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final /* data */ class AccountBanned extends Error {
                public static final AccountBanned INSTANCE = new AccountBanned();

                private AccountBanned() {
                    super(null);
                }

                public boolean equals(Object other) {
                    if (this == other || (other instanceof AccountBanned)) {
                        return true;
                    }
                    return false;
                }

                public int hashCode() {
                    return 2028009858;
                }

                public String toString() {
                    return "AccountBanned";
                }
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/services/AuthService$AuthResult$Error$AccountDeleted;", "Lio/elevenlabs/domain/services/AuthService$AuthResult$Error;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final /* data */ class AccountDeleted extends Error {
                public static final AccountDeleted INSTANCE = new AccountDeleted();

                private AccountDeleted() {
                    super(null);
                }

                public boolean equals(Object other) {
                    if (this == other || (other instanceof AccountDeleted)) {
                        return true;
                    }
                    return false;
                }

                public int hashCode() {
                    return 331219509;
                }

                public String toString() {
                    return "AccountDeleted";
                }
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/services/AuthService$AuthResult$Error$AccountNotVerified;", "Lio/elevenlabs/domain/services/AuthService$AuthResult$Error;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final /* data */ class AccountNotVerified extends Error {
                public static final AccountNotVerified INSTANCE = new AccountNotVerified();

                private AccountNotVerified() {
                    super(null);
                }

                public boolean equals(Object other) {
                    if (this == other || (other instanceof AccountNotVerified)) {
                        return true;
                    }
                    return false;
                }

                public int hashCode() {
                    return 146738903;
                }

                public String toString() {
                    return "AccountNotVerified";
                }
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/services/AuthService$AuthResult$Error$FailedToConnect;", "Lio/elevenlabs/domain/services/AuthService$AuthResult$Error;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final /* data */ class FailedToConnect extends Error {
                public static final FailedToConnect INSTANCE = new FailedToConnect();

                private FailedToConnect() {
                    super(null);
                }

                public boolean equals(Object other) {
                    if (this == other || (other instanceof FailedToConnect)) {
                        return true;
                    }
                    return false;
                }

                public int hashCode() {
                    return -240201143;
                }

                public String toString() {
                    return "FailedToConnect";
                }
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/services/AuthService$AuthResult$Error$FirebaseGeneric;", "Lio/elevenlabs/domain/services/AuthService$AuthResult$Error;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final /* data */ class FirebaseGeneric extends Error {
                private final String message;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public FirebaseGeneric(String str) {
                    super(null);
                    str.getClass();
                    this.message = str;
                }

                public static /* synthetic */ FirebaseGeneric copy$default(FirebaseGeneric firebaseGeneric, String str, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = firebaseGeneric.message;
                    }
                    return firebaseGeneric.copy(str);
                }

                /* renamed from: component1, reason: from getter */
                public final String getMessage() {
                    return this.message;
                }

                public final FirebaseGeneric copy(String message) {
                    message.getClass();
                    return new FirebaseGeneric(message);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if ((other instanceof FirebaseGeneric) && m.c(this.message, ((FirebaseGeneric) other).message)) {
                        return true;
                    }
                    return false;
                }

                public final String getMessage() {
                    return this.message;
                }

                public int hashCode() {
                    return this.message.hashCode();
                }

                public String toString() {
                    return defpackage.f.C("FirebaseGeneric(message=", this.message, Separators.RPAREN);
                }
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/services/AuthService$AuthResult$Error$InvalidCredentials;", "Lio/elevenlabs/domain/services/AuthService$AuthResult$Error;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final /* data */ class InvalidCredentials extends Error {
                public static final InvalidCredentials INSTANCE = new InvalidCredentials();

                private InvalidCredentials() {
                    super(null);
                }

                public boolean equals(Object other) {
                    if (this == other || (other instanceof InvalidCredentials)) {
                        return true;
                    }
                    return false;
                }

                public int hashCode() {
                    return -753386226;
                }

                public String toString() {
                    return "InvalidCredentials";
                }
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/services/AuthService$AuthResult$Error$InvalidEmail;", "Lio/elevenlabs/domain/services/AuthService$AuthResult$Error;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final /* data */ class InvalidEmail extends Error {
                public static final InvalidEmail INSTANCE = new InvalidEmail();

                private InvalidEmail() {
                    super(null);
                }

                public boolean equals(Object other) {
                    if (this == other || (other instanceof InvalidEmail)) {
                        return true;
                    }
                    return false;
                }

                public int hashCode() {
                    return -80028882;
                }

                public String toString() {
                    return "InvalidEmail";
                }
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/services/AuthService$AuthResult$Error$MultiFactorError;", "Lio/elevenlabs/domain/services/AuthService$AuthResult$Error;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lio/elevenlabs/domain/usecase/ResolveMultiFactorResult$Error;", "<init>", "(Lio/elevenlabs/domain/usecase/ResolveMultiFactorResult$Error;)V", "getError", "()Lio/elevenlabs/domain/usecase/ResolveMultiFactorResult$Error;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final /* data */ class MultiFactorError extends Error {
                private final ResolveMultiFactorResult.Error error;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public MultiFactorError(ResolveMultiFactorResult.Error error) {
                    super(null);
                    error.getClass();
                    this.error = error;
                }

                public static /* synthetic */ MultiFactorError copy$default(MultiFactorError multiFactorError, ResolveMultiFactorResult.Error error, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        error = multiFactorError.error;
                    }
                    return multiFactorError.copy(error);
                }

                /* renamed from: component1, reason: from getter */
                public final ResolveMultiFactorResult.Error getError() {
                    return this.error;
                }

                public final MultiFactorError copy(ResolveMultiFactorResult.Error error) {
                    error.getClass();
                    return new MultiFactorError(error);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if ((other instanceof MultiFactorError) && m.c(this.error, ((MultiFactorError) other).error)) {
                        return true;
                    }
                    return false;
                }

                public final ResolveMultiFactorResult.Error getError() {
                    return this.error;
                }

                public int hashCode() {
                    return this.error.hashCode();
                }

                public String toString() {
                    return "MultiFactorError(error=" + this.error + Separators.RPAREN;
                }
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/domain/services/AuthService$AuthResult$Error$MultiFactorRequired;", "Lio/elevenlabs/domain/services/AuthService$AuthResult$Error;", "resolver", "", "mfaType", "Lio/elevenlabs/domain/services/MfaType;", "<init>", "(Ljava/lang/Object;Lio/elevenlabs/domain/services/MfaType;)V", "getResolver", "()Ljava/lang/Object;", "getMfaType", "()Lio/elevenlabs/domain/services/MfaType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final /* data */ class MultiFactorRequired extends Error {
                private final MfaType mfaType;
                private final Object resolver;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public MultiFactorRequired(Object obj, MfaType mfaType) {
                    super(null);
                    obj.getClass();
                    mfaType.getClass();
                    this.resolver = obj;
                    this.mfaType = mfaType;
                }

                public static /* synthetic */ MultiFactorRequired copy$default(MultiFactorRequired multiFactorRequired, Object obj, MfaType mfaType, int i10, Object obj2) {
                    if ((i10 & 1) != 0) {
                        obj = multiFactorRequired.resolver;
                    }
                    if ((i10 & 2) != 0) {
                        mfaType = multiFactorRequired.mfaType;
                    }
                    return multiFactorRequired.copy(obj, mfaType);
                }

                /* renamed from: component1, reason: from getter */
                public final Object getResolver() {
                    return this.resolver;
                }

                /* renamed from: component2, reason: from getter */
                public final MfaType getMfaType() {
                    return this.mfaType;
                }

                public final MultiFactorRequired copy(Object resolver, MfaType mfaType) {
                    resolver.getClass();
                    mfaType.getClass();
                    return new MultiFactorRequired(resolver, mfaType);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof MultiFactorRequired)) {
                        return false;
                    }
                    MultiFactorRequired multiFactorRequired = (MultiFactorRequired) other;
                    if (m.c(this.resolver, multiFactorRequired.resolver) && this.mfaType == multiFactorRequired.mfaType) {
                        return true;
                    }
                    return false;
                }

                public final MfaType getMfaType() {
                    return this.mfaType;
                }

                public final Object getResolver() {
                    return this.resolver;
                }

                public int hashCode() {
                    return this.mfaType.hashCode() + (this.resolver.hashCode() * 31);
                }

                public String toString() {
                    return "MultiFactorRequired(resolver=" + this.resolver + ", mfaType=" + this.mfaType + Separators.RPAREN;
                }
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/services/AuthService$AuthResult$Error$TooManyRequests;", "Lio/elevenlabs/domain/services/AuthService$AuthResult$Error;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final /* data */ class TooManyRequests extends Error {
                public static final TooManyRequests INSTANCE = new TooManyRequests();

                private TooManyRequests() {
                    super(null);
                }

                public boolean equals(Object other) {
                    if (this == other || (other instanceof TooManyRequests)) {
                        return true;
                    }
                    return false;
                }

                public int hashCode() {
                    return -915885362;
                }

                public String toString() {
                    return "TooManyRequests";
                }
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/services/AuthService$AuthResult$Error$Unknown;", "Lio/elevenlabs/domain/services/AuthService$AuthResult$Error;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final /* data */ class Unknown extends Error {
                public static final Unknown INSTANCE = new Unknown();

                private Unknown() {
                    super(null);
                }

                public boolean equals(Object other) {
                    if (this == other || (other instanceof Unknown)) {
                        return true;
                    }
                    return false;
                }

                public int hashCode() {
                    return -294538399;
                }

                public String toString() {
                    return "Unknown";
                }
            }

            private Error() {
                super(null);
            }

            public /* synthetic */ Error(f fVar) {
                this();
            }
        }

        private AuthResult() {
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lio/elevenlabs/domain/services/AuthService$ConfirmEmailResult;", "", "<init>", "()V", "Success", "Error", "Lio/elevenlabs/domain/services/AuthService$ConfirmEmailResult$Error;", "Lio/elevenlabs/domain/services/AuthService$ConfirmEmailResult$Success;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static abstract class ConfirmEmailResult {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/services/AuthService$ConfirmEmailResult$Error;", "Lio/elevenlabs/domain/services/AuthService$ConfirmEmailResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class Error extends ConfirmEmailResult {
            public static final Error INSTANCE = new Error();

            private Error() {
                super(null);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof Error)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 847200057;
            }

            public String toString() {
                return "Error";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/services/AuthService$ConfirmEmailResult$Success;", "Lio/elevenlabs/domain/services/AuthService$ConfirmEmailResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class Success extends ConfirmEmailResult {
            public static final Success INSTANCE = new Success();

            private Success() {
                super(null);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof Success)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 2022253812;
            }

            public String toString() {
                return "Success";
            }
        }

        public /* synthetic */ ConfirmEmailResult(f fVar) {
            this();
        }

        private ConfirmEmailResult() {
        }
    }
}
