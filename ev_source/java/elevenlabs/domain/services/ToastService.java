package io.elevenlabs.domain.services;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import defpackage.f;
import ir.i;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import rd.c1;
import zn.a;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002\u0012\u0013J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\t\u0010\rJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\rR\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/ToastService;", "", "", "message", "", ParameterNames.ICON, "Lio/elevenlabs/domain/services/ToastService$ToastVariant;", "variant", "Lsn/z;", "showToast", "(Ljava/lang/String;Ljava/lang/Integer;Lio/elevenlabs/domain/services/ToastService$ToastVariant;)V", "Lio/elevenlabs/domain/services/ToastService$Toast;", "toast", "(Lio/elevenlabs/domain/services/ToastService$Toast;)V", "pop", "Lir/i;", "getToast", "()Lir/i;", "Toast", "ToastVariant", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface ToastService {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static void showToast(ToastService toastService, String str, Integer num, ToastVariant toastVariant) {
            str.getClass();
            toastVariant.getClass();
            ToastService.super.showToast(str, num, toastVariant);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/domain/services/ToastService$ToastVariant;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "ERROR", "NEUTRAL", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class ToastVariant extends Enum<ToastVariant> {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ToastVariant[] $VALUES;
        public static final ToastVariant SUCCESS = new ToastVariant("SUCCESS", 0);
        public static final ToastVariant ERROR = new ToastVariant("ERROR", 1);
        public static final ToastVariant NEUTRAL = new ToastVariant("NEUTRAL", 2);

        private static final /* synthetic */ ToastVariant[] $values() {
            return new ToastVariant[]{SUCCESS, ERROR, NEUTRAL};
        }

        static {
            ToastVariant[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c1.q($values);
        }

        private ToastVariant(String str, int i10) {
            super(str, i10);
        }

        public static a getEntries() {
            return $ENTRIES;
        }

        public static ToastVariant valueOf(String str) {
            return (ToastVariant) Enum.valueOf(ToastVariant.class, str);
        }

        public static ToastVariant[] values() {
            return (ToastVariant[]) $VALUES.clone();
        }
    }

    static /* synthetic */ void showToast$default(ToastService toastService, String str, Integer num, ToastVariant toastVariant, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                num = null;
            }
            if ((i10 & 4) != 0) {
                toastVariant = ToastVariant.NEUTRAL;
            }
            toastService.showToast(str, num, toastVariant);
            return;
        }
        a9.a.y("Super calls with default arguments not supported in this target, function: showToast");
    }

    i getToast();

    void pop(Toast toast);

    void showToast(Toast toast);

    default void showToast(String message, Integer r32, ToastVariant variant) {
        message.getClass();
        variant.getClass();
        showToast(new Toast.Message(message, r32, variant));
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/ToastService$Toast;", "", "Message", "Action", "Lio/elevenlabs/domain/services/ToastService$Toast$Action;", "Lio/elevenlabs/domain/services/ToastService$Toast$Message;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public interface Toast {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lio/elevenlabs/domain/services/ToastService$Toast$Action;", "Lio/elevenlabs/domain/services/ToastService$Toast;", "title", "", "message", "deeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getMessage", "getDeeplink", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class Action implements Toast {
            private final String deeplink;
            private final String message;
            private final String title;

            public Action(String str, String str2, String str3) {
                str2.getClass();
                this.title = str;
                this.message = str2;
                this.deeplink = str3;
            }

            public static /* synthetic */ Action copy$default(Action action, String str, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = action.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = action.message;
                }
                if ((i10 & 4) != 0) {
                    str3 = action.deeplink;
                }
                return action.copy(str, str2, str3);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            /* renamed from: component3, reason: from getter */
            public final String getDeeplink() {
                return this.deeplink;
            }

            public final Action copy(String title, String message, String deeplink) {
                message.getClass();
                return new Action(title, message, deeplink);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Action)) {
                    return false;
                }
                Action action = (Action) other;
                if (m.c(this.title, action.title) && m.c(this.message, action.message) && m.c(this.deeplink, action.deeplink)) {
                    return true;
                }
                return false;
            }

            public final String getDeeplink() {
                return this.deeplink;
            }

            public final String getMessage() {
                return this.message;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode;
                String str = this.title;
                int i10 = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                int c5 = c.c(hashCode * 31, 31, this.message);
                String str2 = this.deeplink;
                if (str2 != null) {
                    i10 = str2.hashCode();
                }
                return c5 + i10;
            }

            public String toString() {
                return f.l(this.deeplink, Separators.RPAREN, f.s("Action(title=", this.title, ", message=", this.message, ", deeplink="));
            }

            public /* synthetic */ Action(String str, String str2, String str3, int i10, kotlin.jvm.internal.f fVar) {
                this(str, str2, (i10 & 4) != 0 ? null : str3);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lio/elevenlabs/domain/services/ToastService$Toast$Message;", "Lio/elevenlabs/domain/services/ToastService$Toast;", "message", "", ParameterNames.ICON, "", "variant", "Lio/elevenlabs/domain/services/ToastService$ToastVariant;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lio/elevenlabs/domain/services/ToastService$ToastVariant;)V", "getMessage", "()Ljava/lang/String;", "getIcon", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getVariant", "()Lio/elevenlabs/domain/services/ToastService$ToastVariant;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Lio/elevenlabs/domain/services/ToastService$ToastVariant;)Lio/elevenlabs/domain/services/ToastService$Toast$Message;", "equals", "", "other", "", "hashCode", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class Message implements Toast {
            private final Integer icon;
            private final String message;
            private final ToastVariant variant;

            public Message(String str, Integer num, ToastVariant toastVariant) {
                str.getClass();
                toastVariant.getClass();
                this.message = str;
                this.icon = num;
                this.variant = toastVariant;
            }

            public static /* synthetic */ Message copy$default(Message message, String str, Integer num, ToastVariant toastVariant, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = message.message;
                }
                if ((i10 & 2) != 0) {
                    num = message.icon;
                }
                if ((i10 & 4) != 0) {
                    toastVariant = message.variant;
                }
                return message.copy(str, num, toastVariant);
            }

            /* renamed from: component1, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            /* renamed from: component2, reason: from getter */
            public final Integer getIcon() {
                return this.icon;
            }

            /* renamed from: component3, reason: from getter */
            public final ToastVariant getVariant() {
                return this.variant;
            }

            public final Message copy(String message, Integer r32, ToastVariant variant) {
                message.getClass();
                variant.getClass();
                return new Message(message, r32, variant);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Message)) {
                    return false;
                }
                Message message = (Message) other;
                if (m.c(this.message, message.message) && m.c(this.icon, message.icon) && this.variant == message.variant) {
                    return true;
                }
                return false;
            }

            public final Integer getIcon() {
                return this.icon;
            }

            public final String getMessage() {
                return this.message;
            }

            public final ToastVariant getVariant() {
                return this.variant;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2 = this.message.hashCode() * 31;
                Integer num = this.icon;
                if (num == null) {
                    hashCode = 0;
                } else {
                    hashCode = num.hashCode();
                }
                return this.variant.hashCode() + ((hashCode2 + hashCode) * 31);
            }

            public String toString() {
                return "Message(message=" + this.message + ", icon=" + this.icon + ", variant=" + this.variant + Separators.RPAREN;
            }

            public /* synthetic */ Message(String str, Integer num, ToastVariant toastVariant, int i10, kotlin.jvm.internal.f fVar) {
                this(str, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? ToastVariant.NEUTRAL : toastVariant);
            }
        }
    }
}
