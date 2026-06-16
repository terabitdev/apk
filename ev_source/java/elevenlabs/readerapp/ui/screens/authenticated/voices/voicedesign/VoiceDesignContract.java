package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.SDPKeywords;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import rd.c1;
import tn.o;
import tn.t;
import wq.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract;", "", "Step", "State", "PreviewItem", SIPHeaderNames.EVENT, "Effect", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public interface VoiceDesignContract {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Effect;", "", "CloseSheet", "VoiceCreated", "NavigateToPaywall", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Effect$CloseSheet;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Effect$NavigateToPaywall;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Effect$VoiceCreated;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface Effect {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Effect$CloseSheet;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Effect;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class CloseSheet implements Effect {
            public static final int $stable = 0;
            public static final CloseSheet INSTANCE = new CloseSheet();

            private CloseSheet() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof CloseSheet)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1729225278;
            }

            public String toString() {
                return "CloseSheet";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Effect$NavigateToPaywall;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Effect;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class NavigateToPaywall implements Effect {
            public static final int $stable = 0;
            public static final NavigateToPaywall INSTANCE = new NavigateToPaywall();

            private NavigateToPaywall() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof NavigateToPaywall)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1506786001;
            }

            public String toString() {
                return "NavigateToPaywall";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Effect$VoiceCreated;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Effect;", "voiceId", "", "voiceName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getVoiceId", "()Ljava/lang/String;", "getVoiceName", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class VoiceCreated implements Effect {
            public static final int $stable = 0;
            private final String voiceId;
            private final String voiceName;

            public VoiceCreated(String str, String str2) {
                str.getClass();
                str2.getClass();
                this.voiceId = str;
                this.voiceName = str2;
            }

            public static /* synthetic */ VoiceCreated copy$default(VoiceCreated voiceCreated, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = voiceCreated.voiceId;
                }
                if ((i10 & 2) != 0) {
                    str2 = voiceCreated.voiceName;
                }
                return voiceCreated.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getVoiceId() {
                return this.voiceId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getVoiceName() {
                return this.voiceName;
            }

            public final VoiceCreated copy(String voiceId, String voiceName) {
                voiceId.getClass();
                voiceName.getClass();
                return new VoiceCreated(voiceId, voiceName);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof VoiceCreated)) {
                    return false;
                }
                VoiceCreated voiceCreated = (VoiceCreated) other;
                if (m.c(this.voiceId, voiceCreated.voiceId) && m.c(this.voiceName, voiceCreated.voiceName)) {
                    return true;
                }
                return false;
            }

            public final String getVoiceId() {
                return this.voiceId;
            }

            public final String getVoiceName() {
                return this.voiceName;
            }

            public int hashCode() {
                return this.voiceName.hashCode() + (this.voiceId.hashCode() * 31);
            }

            public String toString() {
                return z.h.c("VoiceCreated(voiceId=", this.voiceId, ", voiceName=", this.voiceName, Separators.RPAREN);
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0011\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0082\u0001\u0011\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$À\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event;", "", "UpdateDescription", "GenerateVoice", "SelectPromptPill", "UpdatePreviewIndex", "SelectPreview", "UpdateVoiceName", "SaveVoice", "GoBack", "Close", "ShowDiscardDialog", "HideDiscardDialog", "ConfirmDiscard", "ShowTips", "HideTips", "PlayPreview", "StopPreview", "Retry", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event$Close;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event$ConfirmDiscard;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event$GenerateVoice;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event$GoBack;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event$HideDiscardDialog;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event$HideTips;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event$PlayPreview;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event$Retry;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event$SaveVoice;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event$SelectPreview;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event$SelectPromptPill;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event$ShowDiscardDialog;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event$ShowTips;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event$StopPreview;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event$UpdateDescription;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event$UpdatePreviewIndex;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event$UpdateVoiceName;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface Event {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event$Close;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class Close implements Event {
            public static final int $stable = 0;
            public static final Close INSTANCE = new Close();

            private Close() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof Close)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1361152094;
            }

            public String toString() {
                return "Close";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event$ConfirmDiscard;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class ConfirmDiscard implements Event {
            public static final int $stable = 0;
            public static final ConfirmDiscard INSTANCE = new ConfirmDiscard();

            private ConfirmDiscard() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof ConfirmDiscard)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 681593368;
            }

            public String toString() {
                return "ConfirmDiscard";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event$GenerateVoice;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class GenerateVoice implements Event {
            public static final int $stable = 0;
            public static final GenerateVoice INSTANCE = new GenerateVoice();

            private GenerateVoice() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof GenerateVoice)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1930829533;
            }

            public String toString() {
                return "GenerateVoice";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event$GoBack;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class GoBack implements Event {
            public static final int $stable = 0;
            public static final GoBack INSTANCE = new GoBack();

            private GoBack() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof GoBack)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -638028727;
            }

            public String toString() {
                return "GoBack";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event$HideDiscardDialog;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class HideDiscardDialog implements Event {
            public static final int $stable = 0;
            public static final HideDiscardDialog INSTANCE = new HideDiscardDialog();

            private HideDiscardDialog() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof HideDiscardDialog)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -411225398;
            }

            public String toString() {
                return "HideDiscardDialog";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event$HideTips;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class HideTips implements Event {
            public static final int $stable = 0;
            public static final HideTips INSTANCE = new HideTips();

            private HideTips() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof HideTips)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1570855052;
            }

            public String toString() {
                return "HideTips";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event$PlayPreview;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event;", "previewId", "", "<init>", "(Ljava/lang/String;)V", "getPreviewId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class PlayPreview implements Event {
            public static final int $stable = 0;
            private final String previewId;

            public PlayPreview(String str) {
                str.getClass();
                this.previewId = str;
            }

            public static /* synthetic */ PlayPreview copy$default(PlayPreview playPreview, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = playPreview.previewId;
                }
                return playPreview.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getPreviewId() {
                return this.previewId;
            }

            public final PlayPreview copy(String previewId) {
                previewId.getClass();
                return new PlayPreview(previewId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof PlayPreview) && m.c(this.previewId, ((PlayPreview) other).previewId)) {
                    return true;
                }
                return false;
            }

            public final String getPreviewId() {
                return this.previewId;
            }

            public int hashCode() {
                return this.previewId.hashCode();
            }

            public String toString() {
                return defpackage.f.C("PlayPreview(previewId=", this.previewId, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event$Retry;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class Retry implements Event {
            public static final int $stable = 0;
            public static final Retry INSTANCE = new Retry();

            private Retry() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof Retry)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1374801166;
            }

            public String toString() {
                return "Retry";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event$SaveVoice;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class SaveVoice implements Event {
            public static final int $stable = 0;
            public static final SaveVoice INSTANCE = new SaveVoice();

            private SaveVoice() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof SaveVoice)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -2119394021;
            }

            public String toString() {
                return "SaveVoice";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event$SelectPreview;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class SelectPreview implements Event {
            public static final int $stable = 0;
            public static final SelectPreview INSTANCE = new SelectPreview();

            private SelectPreview() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof SelectPreview)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1033754514;
            }

            public String toString() {
                return "SelectPreview";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event$SelectPromptPill;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event;", SDPKeywords.PROMPT, "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignPrompt;", "<init>", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignPrompt;)V", "getPrompt", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignPrompt;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class SelectPromptPill implements Event {
            public static final int $stable = 0;
            private final VoiceDesignPrompt prompt;

            public SelectPromptPill(VoiceDesignPrompt voiceDesignPrompt) {
                voiceDesignPrompt.getClass();
                this.prompt = voiceDesignPrompt;
            }

            public static /* synthetic */ SelectPromptPill copy$default(SelectPromptPill selectPromptPill, VoiceDesignPrompt voiceDesignPrompt, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    voiceDesignPrompt = selectPromptPill.prompt;
                }
                return selectPromptPill.copy(voiceDesignPrompt);
            }

            /* renamed from: component1, reason: from getter */
            public final VoiceDesignPrompt getPrompt() {
                return this.prompt;
            }

            public final SelectPromptPill copy(VoiceDesignPrompt prompt) {
                prompt.getClass();
                return new SelectPromptPill(prompt);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof SelectPromptPill) && m.c(this.prompt, ((SelectPromptPill) other).prompt)) {
                    return true;
                }
                return false;
            }

            public final VoiceDesignPrompt getPrompt() {
                return this.prompt;
            }

            public int hashCode() {
                return this.prompt.hashCode();
            }

            public String toString() {
                return "SelectPromptPill(prompt=" + this.prompt + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event$ShowDiscardDialog;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class ShowDiscardDialog implements Event {
            public static final int $stable = 0;
            public static final ShowDiscardDialog INSTANCE = new ShowDiscardDialog();

            private ShowDiscardDialog() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof ShowDiscardDialog)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 993893615;
            }

            public String toString() {
                return "ShowDiscardDialog";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event$ShowTips;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class ShowTips implements Event {
            public static final int $stable = 0;
            public static final ShowTips INSTANCE = new ShowTips();

            private ShowTips() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof ShowTips)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -135770193;
            }

            public String toString() {
                return "ShowTips";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event$StopPreview;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class StopPreview implements Event {
            public static final int $stable = 0;
            public static final StopPreview INSTANCE = new StopPreview();

            private StopPreview() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof StopPreview)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 449090380;
            }

            public String toString() {
                return "StopPreview";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event$UpdateDescription;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event;", ParameterNames.TEXT, "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class UpdateDescription implements Event {
            public static final int $stable = 0;
            private final String text;

            public UpdateDescription(String str) {
                str.getClass();
                this.text = str;
            }

            public static /* synthetic */ UpdateDescription copy$default(UpdateDescription updateDescription, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = updateDescription.text;
                }
                return updateDescription.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getText() {
                return this.text;
            }

            public final UpdateDescription copy(String text) {
                text.getClass();
                return new UpdateDescription(text);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof UpdateDescription) && m.c(this.text, ((UpdateDescription) other).text)) {
                    return true;
                }
                return false;
            }

            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                return this.text.hashCode();
            }

            public String toString() {
                return defpackage.f.C("UpdateDescription(text=", this.text, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event$UpdatePreviewIndex;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event;", FirebaseAnalytics.Param.INDEX, "", "<init>", "(I)V", "getIndex", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class UpdatePreviewIndex implements Event {
            public static final int $stable = 0;
            private final int index;

            public UpdatePreviewIndex(int i10) {
                this.index = i10;
            }

            public static /* synthetic */ UpdatePreviewIndex copy$default(UpdatePreviewIndex updatePreviewIndex, int i10, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = updatePreviewIndex.index;
                }
                return updatePreviewIndex.copy(i10);
            }

            /* renamed from: component1, reason: from getter */
            public final int getIndex() {
                return this.index;
            }

            public final UpdatePreviewIndex copy(int index) {
                return new UpdatePreviewIndex(index);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof UpdatePreviewIndex) && this.index == ((UpdatePreviewIndex) other).index) {
                    return true;
                }
                return false;
            }

            public final int getIndex() {
                return this.index;
            }

            public int hashCode() {
                return Integer.hashCode(this.index);
            }

            public String toString() {
                return com.google.android.gms.internal.play_billing.b.j(this.index, "UpdatePreviewIndex(index=", Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event$UpdateVoiceName;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event;", DiagnosticsEntry.NAME_KEY, "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class UpdateVoiceName implements Event {
            public static final int $stable = 0;
            private final String name;

            public UpdateVoiceName(String str) {
                str.getClass();
                this.name = str;
            }

            public static /* synthetic */ UpdateVoiceName copy$default(UpdateVoiceName updateVoiceName, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = updateVoiceName.name;
                }
                return updateVoiceName.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getName() {
                return this.name;
            }

            public final UpdateVoiceName copy(String name) {
                name.getClass();
                return new UpdateVoiceName(name);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof UpdateVoiceName) && m.c(this.name, ((UpdateVoiceName) other).name)) {
                    return true;
                }
                return false;
            }

            public final String getName() {
                return this.name;
            }

            public int hashCode() {
                return this.name.hashCode();
            }

            public String toString() {
                return defpackage.f.C("UpdateVoiceName(name=", this.name, Separators.RPAREN);
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ8\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$PreviewItem;", "", "generatedVoiceId", "", Constants.ScionAnalytics.PARAM_LABEL, "audioFileUri", "durationSeconds", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "getGeneratedVoiceId", "()Ljava/lang/String;", "getLabel", "getAudioFileUri", "getDurationSeconds", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$PreviewItem;", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class PreviewItem {
        public static final int $stable = 0;
        private final String audioFileUri;
        private final Double durationSeconds;
        private final String generatedVoiceId;
        private final String label;

        public PreviewItem(String str, String str2, String str3, Double d10) {
            ib.i.s(str, str2, str3);
            this.generatedVoiceId = str;
            this.label = str2;
            this.audioFileUri = str3;
            this.durationSeconds = d10;
        }

        public static /* synthetic */ PreviewItem copy$default(PreviewItem previewItem, String str, String str2, String str3, Double d10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = previewItem.generatedVoiceId;
            }
            if ((i10 & 2) != 0) {
                str2 = previewItem.label;
            }
            if ((i10 & 4) != 0) {
                str3 = previewItem.audioFileUri;
            }
            if ((i10 & 8) != 0) {
                d10 = previewItem.durationSeconds;
            }
            return previewItem.copy(str, str2, str3, d10);
        }

        /* renamed from: component1, reason: from getter */
        public final String getGeneratedVoiceId() {
            return this.generatedVoiceId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAudioFileUri() {
            return this.audioFileUri;
        }

        /* renamed from: component4, reason: from getter */
        public final Double getDurationSeconds() {
            return this.durationSeconds;
        }

        public final PreviewItem copy(String generatedVoiceId, String label, String audioFileUri, Double durationSeconds) {
            generatedVoiceId.getClass();
            label.getClass();
            audioFileUri.getClass();
            return new PreviewItem(generatedVoiceId, label, audioFileUri, durationSeconds);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PreviewItem)) {
                return false;
            }
            PreviewItem previewItem = (PreviewItem) other;
            if (m.c(this.generatedVoiceId, previewItem.generatedVoiceId) && m.c(this.label, previewItem.label) && m.c(this.audioFileUri, previewItem.audioFileUri) && m.c(this.durationSeconds, previewItem.durationSeconds)) {
                return true;
            }
            return false;
        }

        public final String getAudioFileUri() {
            return this.audioFileUri;
        }

        public final Double getDurationSeconds() {
            return this.durationSeconds;
        }

        public final String getGeneratedVoiceId() {
            return this.generatedVoiceId;
        }

        public final String getLabel() {
            return this.label;
        }

        public int hashCode() {
            int hashCode;
            int c5 = j0.c.c(j0.c.c(this.generatedVoiceId.hashCode() * 31, 31, this.label), 31, this.audioFileUri);
            Double d10 = this.durationSeconds;
            if (d10 == null) {
                hashCode = 0;
            } else {
                hashCode = d10.hashCode();
            }
            return c5 + hashCode;
        }

        public String toString() {
            String str = this.generatedVoiceId;
            String str2 = this.label;
            String str3 = this.audioFileUri;
            Double d10 = this.durationSeconds;
            StringBuilder s10 = defpackage.f.s("PreviewItem(generatedVoiceId=", str, ", label=", str2, ", audioFileUri=");
            s10.append(str3);
            s10.append(", durationSeconds=");
            s10.append(d10);
            s10.append(Separators.RPAREN);
            return s10.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Step;", "", "<init>", "(Ljava/lang/String;I)V", "VOICE_PROMPT", "GENERATING", "SELECT_PREVIEW", "SAVE_VOICE", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Step {
        private static final /* synthetic */ zn.a $ENTRIES;
        private static final /* synthetic */ Step[] $VALUES;
        public static final Step VOICE_PROMPT = new Step("VOICE_PROMPT", 0);
        public static final Step GENERATING = new Step("GENERATING", 1);
        public static final Step SELECT_PREVIEW = new Step("SELECT_PREVIEW", 2);
        public static final Step SAVE_VOICE = new Step("SAVE_VOICE", 3);

        private static final /* synthetic */ Step[] $values() {
            return new Step[]{VOICE_PROMPT, GENERATING, SELECT_PREVIEW, SAVE_VOICE};
        }

        static {
            Step[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c1.q($values);
        }

        private Step(String str, int i10) {
        }

        public static zn.a getEntries() {
            return $ENTRIES;
        }

        public static Step valueOf(String str) {
            return (Step) Enum.valueOf(Step.class, str);
        }

        public static Step[] values() {
            return (Step[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b8\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\rHÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0007HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010;\u001a\u00020\u0007HÆ\u0003J\t\u0010<\u001a\u00020\u0007HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010?\u001a\u00020\u0007HÆ\u0003J¡\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u0007HÆ\u0001J\u0014\u0010A\u001a\u00020\u00072\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010C\u001a\u00020\rHÖ\u0081\u0004J\n\u0010D\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u001cR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001cR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0011\u0010\u0011\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0011\u0010\u0012\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0011\u0010\u0015\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0011\u0010)\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b)\u0010\u001cR\u0011\u0010*\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b*\u0010\u001cR\u0011\u0010+\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b,\u0010\u001cR\u0011\u0010-\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b.\u0010\u001cR\u0013\u0010/\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b0\u00101¨\u0006E"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$State;", "", "currentStep", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Step;", "voiceDescription", "", "isGenerating", "", "generatedPreviews", "", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$PreviewItem;", "previewText", "selectedPreviewIndex", "", "voiceName", "isSaving", "playingPreviewId", "showTipsSheet", "showDiscardDialog", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "selectedPromptId", "shouldShowPaywallOnGenerate", "<init>", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Step;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Z)V", "getCurrentStep", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Step;", "getVoiceDescription", "()Ljava/lang/String;", "()Z", "getGeneratedPreviews", "()Ljava/util/List;", "getPreviewText", "getSelectedPreviewIndex", "()I", "getVoiceName", "getPlayingPreviewId", "getShowTipsSheet", "getShowDiscardDialog", "getError", "getSelectedPromptId", "getShouldShowPaywallOnGenerate", "isGenerateButtonEnabled", "isSaveButtonEnabled", "canGoBack", "getCanGoBack", "hasChanges", "getHasChanges", "selectedPreview", "getSelectedPreview", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$PreviewItem;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class State {
        public static final int $stable = 8;
        private final Step currentStep;
        private final String error;
        private final List<PreviewItem> generatedPreviews;
        private final boolean isGenerating;
        private final boolean isSaving;
        private final String playingPreviewId;
        private final String previewText;
        private final int selectedPreviewIndex;
        private final String selectedPromptId;
        private final boolean shouldShowPaywallOnGenerate;
        private final boolean showDiscardDialog;
        private final boolean showTipsSheet;
        private final String voiceDescription;
        private final String voiceName;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ State(Step step, String str, boolean z6, List list, String str2, int i10, String str3, boolean z10, String str4, boolean z11, boolean z12, String str5, String str6, boolean z13, int i11, kotlin.jvm.internal.f fVar) {
            this(r1, r2, r4, r6, r7, r8, r3, r9, r10, r12, r13, r14, r11, r31);
            Step step2;
            String str7;
            boolean z14;
            List list2;
            String str8;
            int i12;
            boolean z15;
            String str9;
            boolean z16;
            boolean z17;
            String str10;
            boolean z18;
            if ((i11 & 1) != 0) {
                step2 = Step.VOICE_PROMPT;
            } else {
                step2 = step;
            }
            if ((i11 & 2) != 0) {
                str7 = "";
            } else {
                str7 = str;
            }
            if ((i11 & 4) != 0) {
                z14 = false;
            } else {
                z14 = z6;
            }
            if ((i11 & 8) != 0) {
                list2 = t.f33547a;
            } else {
                list2 = list;
            }
            if ((i11 & 16) != 0) {
                str8 = "";
            } else {
                str8 = str2;
            }
            if ((i11 & 32) != 0) {
                i12 = 0;
            } else {
                i12 = i10;
            }
            String str11 = (i11 & 64) == 0 ? str3 : "";
            if ((i11 & 128) != 0) {
                z15 = false;
            } else {
                z15 = z10;
            }
            if ((i11 & RpcError.MAX_MESSAGE_BYTES) != 0) {
                str9 = null;
            } else {
                str9 = str4;
            }
            if ((i11 & 512) != 0) {
                z16 = false;
            } else {
                z16 = z11;
            }
            if ((i11 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                z17 = false;
            } else {
                z17 = z12;
            }
            if ((i11 & 2048) != 0) {
                str10 = null;
            } else {
                str10 = str5;
            }
            String str12 = (i11 & 4096) == 0 ? str6 : null;
            if ((i11 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
                z18 = false;
            } else {
                z18 = z13;
            }
        }

        public static /* synthetic */ State copy$default(State state, Step step, String str, boolean z6, List list, String str2, int i10, String str3, boolean z10, String str4, boolean z11, boolean z12, String str5, String str6, boolean z13, int i11, Object obj) {
            Step step2;
            String str7;
            boolean z14;
            List list2;
            String str8;
            int i12;
            String str9;
            boolean z15;
            String str10;
            boolean z16;
            boolean z17;
            String str11;
            String str12;
            boolean z18;
            if ((i11 & 1) != 0) {
                step2 = state.currentStep;
            } else {
                step2 = step;
            }
            if ((i11 & 2) != 0) {
                str7 = state.voiceDescription;
            } else {
                str7 = str;
            }
            if ((i11 & 4) != 0) {
                z14 = state.isGenerating;
            } else {
                z14 = z6;
            }
            if ((i11 & 8) != 0) {
                list2 = state.generatedPreviews;
            } else {
                list2 = list;
            }
            if ((i11 & 16) != 0) {
                str8 = state.previewText;
            } else {
                str8 = str2;
            }
            if ((i11 & 32) != 0) {
                i12 = state.selectedPreviewIndex;
            } else {
                i12 = i10;
            }
            if ((i11 & 64) != 0) {
                str9 = state.voiceName;
            } else {
                str9 = str3;
            }
            if ((i11 & 128) != 0) {
                z15 = state.isSaving;
            } else {
                z15 = z10;
            }
            if ((i11 & RpcError.MAX_MESSAGE_BYTES) != 0) {
                str10 = state.playingPreviewId;
            } else {
                str10 = str4;
            }
            if ((i11 & 512) != 0) {
                z16 = state.showTipsSheet;
            } else {
                z16 = z11;
            }
            if ((i11 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                z17 = state.showDiscardDialog;
            } else {
                z17 = z12;
            }
            if ((i11 & 2048) != 0) {
                str11 = state.error;
            } else {
                str11 = str5;
            }
            if ((i11 & 4096) != 0) {
                str12 = state.selectedPromptId;
            } else {
                str12 = str6;
            }
            if ((i11 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
                z18 = state.shouldShowPaywallOnGenerate;
            } else {
                z18 = z13;
            }
            return state.copy(step2, str7, z14, list2, str8, i12, str9, z15, str10, z16, z17, str11, str12, z18);
        }

        /* renamed from: component1, reason: from getter */
        public final Step getCurrentStep() {
            return this.currentStep;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getShowTipsSheet() {
            return this.showTipsSheet;
        }

        /* renamed from: component11, reason: from getter */
        public final boolean getShowDiscardDialog() {
            return this.showDiscardDialog;
        }

        /* renamed from: component12, reason: from getter */
        public final String getError() {
            return this.error;
        }

        /* renamed from: component13, reason: from getter */
        public final String getSelectedPromptId() {
            return this.selectedPromptId;
        }

        /* renamed from: component14, reason: from getter */
        public final boolean getShouldShowPaywallOnGenerate() {
            return this.shouldShowPaywallOnGenerate;
        }

        /* renamed from: component2, reason: from getter */
        public final String getVoiceDescription() {
            return this.voiceDescription;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsGenerating() {
            return this.isGenerating;
        }

        public final List<PreviewItem> component4() {
            return this.generatedPreviews;
        }

        /* renamed from: component5, reason: from getter */
        public final String getPreviewText() {
            return this.previewText;
        }

        /* renamed from: component6, reason: from getter */
        public final int getSelectedPreviewIndex() {
            return this.selectedPreviewIndex;
        }

        /* renamed from: component7, reason: from getter */
        public final String getVoiceName() {
            return this.voiceName;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getIsSaving() {
            return this.isSaving;
        }

        /* renamed from: component9, reason: from getter */
        public final String getPlayingPreviewId() {
            return this.playingPreviewId;
        }

        public final State copy(Step currentStep, String voiceDescription, boolean isGenerating, List<PreviewItem> generatedPreviews, String previewText, int selectedPreviewIndex, String voiceName, boolean isSaving, String playingPreviewId, boolean showTipsSheet, boolean showDiscardDialog, String error, String selectedPromptId, boolean shouldShowPaywallOnGenerate) {
            currentStep.getClass();
            voiceDescription.getClass();
            generatedPreviews.getClass();
            previewText.getClass();
            voiceName.getClass();
            return new State(currentStep, voiceDescription, isGenerating, generatedPreviews, previewText, selectedPreviewIndex, voiceName, isSaving, playingPreviewId, showTipsSheet, showDiscardDialog, error, selectedPromptId, shouldShowPaywallOnGenerate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            if (this.currentStep == state.currentStep && m.c(this.voiceDescription, state.voiceDescription) && this.isGenerating == state.isGenerating && m.c(this.generatedPreviews, state.generatedPreviews) && m.c(this.previewText, state.previewText) && this.selectedPreviewIndex == state.selectedPreviewIndex && m.c(this.voiceName, state.voiceName) && this.isSaving == state.isSaving && m.c(this.playingPreviewId, state.playingPreviewId) && this.showTipsSheet == state.showTipsSheet && this.showDiscardDialog == state.showDiscardDialog && m.c(this.error, state.error) && m.c(this.selectedPromptId, state.selectedPromptId) && this.shouldShowPaywallOnGenerate == state.shouldShowPaywallOnGenerate) {
                return true;
            }
            return false;
        }

        public final boolean getCanGoBack() {
            if (this.currentStep != Step.VOICE_PROMPT) {
                return true;
            }
            return false;
        }

        public final Step getCurrentStep() {
            return this.currentStep;
        }

        public final String getError() {
            return this.error;
        }

        public final List<PreviewItem> getGeneratedPreviews() {
            return this.generatedPreviews;
        }

        public final boolean getHasChanges() {
            if (n.m0(this.voiceDescription) && !this.isGenerating && this.generatedPreviews.isEmpty()) {
                return false;
            }
            return true;
        }

        public final String getPlayingPreviewId() {
            return this.playingPreviewId;
        }

        public final String getPreviewText() {
            return this.previewText;
        }

        public final PreviewItem getSelectedPreview() {
            return (PreviewItem) o.z0(this.selectedPreviewIndex, this.generatedPreviews);
        }

        public final int getSelectedPreviewIndex() {
            return this.selectedPreviewIndex;
        }

        public final String getSelectedPromptId() {
            return this.selectedPromptId;
        }

        public final boolean getShouldShowPaywallOnGenerate() {
            return this.shouldShowPaywallOnGenerate;
        }

        public final boolean getShowDiscardDialog() {
            return this.showDiscardDialog;
        }

        public final boolean getShowTipsSheet() {
            return this.showTipsSheet;
        }

        public final String getVoiceDescription() {
            return this.voiceDescription;
        }

        public final String getVoiceName() {
            return this.voiceName;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int f10 = com.google.android.gms.internal.play_billing.b.f(j0.c.c(j0.c.b(this.selectedPreviewIndex, j0.c.c(p.n.d(com.google.android.gms.internal.play_billing.b.f(j0.c.c(this.currentStep.hashCode() * 31, 31, this.voiceDescription), 31, this.isGenerating), 31, this.generatedPreviews), 31, this.previewText), 31), 31, this.voiceName), 31, this.isSaving);
            String str = this.playingPreviewId;
            int i10 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int f11 = com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f((f10 + hashCode) * 31, 31, this.showTipsSheet), 31, this.showDiscardDialog);
            String str2 = this.error;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i11 = (f11 + hashCode2) * 31;
            String str3 = this.selectedPromptId;
            if (str3 != null) {
                i10 = str3.hashCode();
            }
            return Boolean.hashCode(this.shouldShowPaywallOnGenerate) + ((i11 + i10) * 31);
        }

        public final boolean isGenerateButtonEnabled() {
            if (this.voiceDescription.length() >= 20 && !this.isGenerating) {
                return true;
            }
            return false;
        }

        public final boolean isGenerating() {
            return this.isGenerating;
        }

        public final boolean isSaveButtonEnabled() {
            if (!n.m0(this.voiceName) && !this.isSaving) {
                return true;
            }
            return false;
        }

        public final boolean isSaving() {
            return this.isSaving;
        }

        public String toString() {
            Step step = this.currentStep;
            String str = this.voiceDescription;
            boolean z6 = this.isGenerating;
            List<PreviewItem> list = this.generatedPreviews;
            String str2 = this.previewText;
            int i10 = this.selectedPreviewIndex;
            String str3 = this.voiceName;
            boolean z10 = this.isSaving;
            String str4 = this.playingPreviewId;
            boolean z11 = this.showTipsSheet;
            boolean z12 = this.showDiscardDialog;
            String str5 = this.error;
            String str6 = this.selectedPromptId;
            boolean z13 = this.shouldShowPaywallOnGenerate;
            StringBuilder sb = new StringBuilder("State(currentStep=");
            sb.append(step);
            sb.append(", voiceDescription=");
            sb.append(str);
            sb.append(", isGenerating=");
            sb.append(z6);
            sb.append(", generatedPreviews=");
            sb.append(list);
            sb.append(", previewText=");
            sb.append(str2);
            sb.append(", selectedPreviewIndex=");
            sb.append(i10);
            sb.append(", voiceName=");
            defpackage.f.y(sb, str3, ", isSaving=", z10, ", playingPreviewId=");
            defpackage.f.y(sb, str4, ", showTipsSheet=", z11, ", showDiscardDialog=");
            defpackage.f.z(sb, z12, ", error=", str5, ", selectedPromptId=");
            sb.append(str6);
            sb.append(", shouldShowPaywallOnGenerate=");
            sb.append(z13);
            sb.append(Separators.RPAREN);
            return sb.toString();
        }

        public State(Step step, String str, boolean z6, List<PreviewItem> list, String str2, int i10, String str3, boolean z10, String str4, boolean z11, boolean z12, String str5, String str6, boolean z13) {
            step.getClass();
            str.getClass();
            list.getClass();
            str2.getClass();
            str3.getClass();
            this.currentStep = step;
            this.voiceDescription = str;
            this.isGenerating = z6;
            this.generatedPreviews = list;
            this.previewText = str2;
            this.selectedPreviewIndex = i10;
            this.voiceName = str3;
            this.isSaving = z10;
            this.playingPreviewId = str4;
            this.showTipsSheet = z11;
            this.showDiscardDialog = z12;
            this.error = str5;
            this.selectedPromptId = str6;
            this.shouldShowPaywallOnGenerate = z13;
        }

        public State() {
            this(null, null, false, null, null, 0, null, false, null, false, false, null, null, false, 16383, null);
        }
    }
}
