package io.elevenlabs.readerapp.ui.screens.authenticated.assistant;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.SDPKeywords;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.domain.model.AssistantConfig;
import io.elevenlabs.domain.services.AssistantInteractionMode;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract;", "", "<init>", "()V", SIPHeaderNames.EVENT, "State", "ControlEvent", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AssistantContract {
    public static final int $stable = 0;
    public static final AssistantContract INSTANCE = new AssistantContract();

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$ControlEvent;", "", "CloseSheet", "OpenUrl", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$ControlEvent$CloseSheet;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$ControlEvent$OpenUrl;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface ControlEvent {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$ControlEvent$CloseSheet;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$ControlEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class CloseSheet implements ControlEvent {
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
                return 841241849;
            }

            public String toString() {
                return "CloseSheet";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$ControlEvent$OpenUrl;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$ControlEvent;", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class OpenUrl implements ControlEvent {
            public static final int $stable = 0;
            private final String url;

            public OpenUrl(String str) {
                str.getClass();
                this.url = str;
            }

            public static /* synthetic */ OpenUrl copy$default(OpenUrl openUrl, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = openUrl.url;
                }
                return openUrl.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            public final OpenUrl copy(String url) {
                url.getClass();
                return new OpenUrl(url);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof OpenUrl) && kotlin.jvm.internal.m.c(this.url, ((OpenUrl) other).url)) {
                    return true;
                }
                return false;
            }

            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                return this.url.hashCode();
            }

            public String toString() {
                return defpackage.f.C("OpenUrl(url=", this.url, Separators.RPAREN);
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0010\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0082\u0001\u0010\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\"À\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event;", "", "Close", "Retry", "LifecycleResume", "LifecyclePause", "DismissExplainer", "AcceptTerms", "DeclineTerms", "ToggleMode", "ToggleMic", "ToggleAudio", "SendTextMessage", "UserTyping", "SuggestedPromptClicked", "OpenOverflowMenu", "CloseOverflowMenu", "GiveFeedback", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event$AcceptTerms;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event$Close;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event$CloseOverflowMenu;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event$DeclineTerms;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event$DismissExplainer;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event$GiveFeedback;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event$LifecyclePause;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event$LifecycleResume;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event$OpenOverflowMenu;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event$Retry;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event$SendTextMessage;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event$SuggestedPromptClicked;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event$ToggleAudio;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event$ToggleMic;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event$ToggleMode;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event$UserTyping;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface Event {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event$AcceptTerms;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class AcceptTerms implements Event {
            public static final int $stable = 0;
            public static final AcceptTerms INSTANCE = new AcceptTerms();

            private AcceptTerms() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof AcceptTerms)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 316129260;
            }

            public String toString() {
                return "AcceptTerms";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event$Close;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
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
                return 729891397;
            }

            public String toString() {
                return "Close";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event$CloseOverflowMenu;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class CloseOverflowMenu implements Event {
            public static final int $stable = 0;
            public static final CloseOverflowMenu INSTANCE = new CloseOverflowMenu();

            private CloseOverflowMenu() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof CloseOverflowMenu)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -459095194;
            }

            public String toString() {
                return "CloseOverflowMenu";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event$DeclineTerms;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class DeclineTerms implements Event {
            public static final int $stable = 0;
            public static final DeclineTerms INSTANCE = new DeclineTerms();

            private DeclineTerms() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof DeclineTerms)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1638073532;
            }

            public String toString() {
                return "DeclineTerms";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event$DismissExplainer;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class DismissExplainer implements Event {
            public static final int $stable = 0;
            public static final DismissExplainer INSTANCE = new DismissExplainer();

            private DismissExplainer() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof DismissExplainer)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 919925261;
            }

            public String toString() {
                return "DismissExplainer";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event$GiveFeedback;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class GiveFeedback implements Event {
            public static final int $stable = 0;
            public static final GiveFeedback INSTANCE = new GiveFeedback();

            private GiveFeedback() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof GiveFeedback)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 228046025;
            }

            public String toString() {
                return "GiveFeedback";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event$LifecyclePause;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class LifecyclePause implements Event {
            public static final int $stable = 0;
            public static final LifecyclePause INSTANCE = new LifecyclePause();

            private LifecyclePause() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof LifecyclePause)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 302023423;
            }

            public String toString() {
                return "LifecyclePause";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event$LifecycleResume;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class LifecycleResume implements Event {
            public static final int $stable = 0;
            public static final LifecycleResume INSTANCE = new LifecycleResume();

            private LifecycleResume() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof LifecycleResume)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 833686596;
            }

            public String toString() {
                return "LifecycleResume";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event$OpenOverflowMenu;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class OpenOverflowMenu implements Event {
            public static final int $stable = 0;
            public static final OpenOverflowMenu INSTANCE = new OpenOverflowMenu();

            private OpenOverflowMenu() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof OpenOverflowMenu)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -2130992770;
            }

            public String toString() {
                return "OpenOverflowMenu";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event$Retry;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
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
                return 743540469;
            }

            public String toString() {
                return "Retry";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event$SendTextMessage;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event;", ParameterNames.TEXT, "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class SendTextMessage implements Event {
            public static final int $stable = 0;
            private final String text;

            public SendTextMessage(String str) {
                str.getClass();
                this.text = str;
            }

            public static /* synthetic */ SendTextMessage copy$default(SendTextMessage sendTextMessage, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = sendTextMessage.text;
                }
                return sendTextMessage.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getText() {
                return this.text;
            }

            public final SendTextMessage copy(String text) {
                text.getClass();
                return new SendTextMessage(text);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof SendTextMessage) && kotlin.jvm.internal.m.c(this.text, ((SendTextMessage) other).text)) {
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
                return defpackage.f.C("SendTextMessage(text=", this.text, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event$SuggestedPromptClicked;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event;", SDPKeywords.PROMPT, "", "<init>", "(Ljava/lang/String;)V", "getPrompt", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class SuggestedPromptClicked implements Event {
            public static final int $stable = 0;
            private final String prompt;

            public SuggestedPromptClicked(String str) {
                str.getClass();
                this.prompt = str;
            }

            public static /* synthetic */ SuggestedPromptClicked copy$default(SuggestedPromptClicked suggestedPromptClicked, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = suggestedPromptClicked.prompt;
                }
                return suggestedPromptClicked.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getPrompt() {
                return this.prompt;
            }

            public final SuggestedPromptClicked copy(String prompt) {
                prompt.getClass();
                return new SuggestedPromptClicked(prompt);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof SuggestedPromptClicked) && kotlin.jvm.internal.m.c(this.prompt, ((SuggestedPromptClicked) other).prompt)) {
                    return true;
                }
                return false;
            }

            public final String getPrompt() {
                return this.prompt;
            }

            public int hashCode() {
                return this.prompt.hashCode();
            }

            public String toString() {
                return defpackage.f.C("SuggestedPromptClicked(prompt=", this.prompt, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event$ToggleAudio;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class ToggleAudio implements Event {
            public static final int $stable = 0;
            public static final ToggleAudio INSTANCE = new ToggleAudio();

            private ToggleAudio() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof ToggleAudio)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -975168657;
            }

            public String toString() {
                return "ToggleAudio";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event$ToggleMic;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class ToggleMic implements Event {
            public static final int $stable = 0;
            public static final ToggleMic INSTANCE = new ToggleMic();

            private ToggleMic() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof ToggleMic)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 2112960544;
            }

            public String toString() {
                return "ToggleMic";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0083\u0004J\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event$ToggleMode;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event;", "isKeyboardVisible", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class ToggleMode implements Event {
            public static final int $stable = 0;
            private final boolean isKeyboardVisible;

            public ToggleMode(boolean z6) {
                this.isKeyboardVisible = z6;
            }

            public static /* synthetic */ ToggleMode copy$default(ToggleMode toggleMode, boolean z6, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    z6 = toggleMode.isKeyboardVisible;
                }
                return toggleMode.copy(z6);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsKeyboardVisible() {
                return this.isKeyboardVisible;
            }

            public final ToggleMode copy(boolean isKeyboardVisible) {
                return new ToggleMode(isKeyboardVisible);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof ToggleMode) && this.isKeyboardVisible == ((ToggleMode) other).isKeyboardVisible) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isKeyboardVisible);
            }

            public final boolean isKeyboardVisible() {
                return this.isKeyboardVisible;
            }

            public String toString() {
                return "ToggleMode(isKeyboardVisible=" + this.isKeyboardVisible + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event$UserTyping;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class UserTyping implements Event {
            public static final int $stable = 0;
            public static final UserTyping INSTANCE = new UserTyping();

            private UserTyping() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof UserTyping)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -739730187;
            }

            public String toString() {
                return "UserTyping";
            }
        }
    }

    private AssistantContract() {
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\bI\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bç\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\t\u0012\b\b\u0002\u0010\u0019\u001a\u00020\t\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u001b\u001a\u00020\t\u0012\b\b\u0002\u0010\u001c\u001a\u00020\t\u0012\b\b\u0002\u0010\u001d\u001a\u00020\t\u0012\b\b\u0002\u0010\u001e\u001a\u00020\t\u0012\b\b\u0002\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b \u0010!J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0005HÆ\u0003J\t\u0010I\u001a\u00020\u0007HÆ\u0003J\t\u0010J\u001a\u00020\tHÆ\u0003J\t\u0010K\u001a\u00020\tHÆ\u0003J\t\u0010L\u001a\u00020\tHÆ\u0003J\t\u0010M\u001a\u00020\tHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010O\u001a\u00020\u0010HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u0010Q\u001a\u00020\tHÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016HÆ\u0003J\t\u0010T\u001a\u00020\tHÆ\u0003J\t\u0010U\u001a\u00020\tHÆ\u0003J\u0010\u0010V\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u00107J\t\u0010W\u001a\u00020\tHÆ\u0003J\t\u0010X\u001a\u00020\tHÆ\u0003J\t\u0010Y\u001a\u00020\tHÆ\u0003J\t\u0010Z\u001a\u00020\tHÆ\u0003J\t\u0010[\u001a\u00020\tHÆ\u0003Jî\u0001\u0010\\\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010]J\u0014\u0010^\u001a\u00020\t2\b\u0010_\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010`\u001a\u00020aHÖ\u0081\u0004J\n\u0010b\u001a\u00020\u000eHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010)R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010)R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0013\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b1\u0010)R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b2\u0010,R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u0018\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010)R\u0011\u0010\u0019\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b5\u0010)R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u00108\u001a\u0004\b6\u00107R\u0011\u0010\u001b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b9\u0010)R\u0011\u0010\u001c\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b:\u0010)R\u0011\u0010\u001d\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b;\u0010)R\u0011\u0010\u001e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b<\u0010)R\u0011\u0010\u001f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010)R\u0011\u0010=\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b>\u0010)R\u0011\u0010?\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b@\u0010)R\u0011\u0010A\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bB\u0010)R\u0011\u0010C\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bD\u0010)R\u0011\u0010E\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bF\u0010)¨\u0006c"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$State;", "", "status", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantStatus;", "mode", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantMode;", "interactionMode", "Lio/elevenlabs/domain/services/AssistantInteractionMode;", "showExplainerMessage", "", "canSendFeedback", "isMicMuted", "isAudioMuted", "conversationId", "", "lastVadScore", "", "assistantConfig", "Lio/elevenlabs/domain/model/AssistantConfig;", "hidePromptSuggestions", "configError", "chatMessages", "", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/ChatMessage;", "isAssistantTyping", "showTermsAcceptance", "micPermissionGranted", "hasDeniedInitialPermissionPrompt", "micPermissionPermanentlyDenied", "hasRequestedInitialPermission", "showOverflowMenu", "isTransitioning", "<init>", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantStatus;Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantMode;Lio/elevenlabs/domain/services/AssistantInteractionMode;ZZZZLjava/lang/String;FLio/elevenlabs/domain/model/AssistantConfig;ZLjava/lang/String;Ljava/util/List;ZZLjava/lang/Boolean;ZZZZZ)V", "getStatus", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantStatus;", "getMode", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantMode;", "getInteractionMode", "()Lio/elevenlabs/domain/services/AssistantInteractionMode;", "getShowExplainerMessage", "()Z", "getCanSendFeedback", "getConversationId", "()Ljava/lang/String;", "getLastVadScore", "()F", "getAssistantConfig", "()Lio/elevenlabs/domain/model/AssistantConfig;", "getHidePromptSuggestions", "getConfigError", "getChatMessages", "()Ljava/util/List;", "getShowTermsAcceptance", "getMicPermissionGranted", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHasDeniedInitialPermissionPrompt", "getMicPermissionPermanentlyDenied", "getHasRequestedInitialPermission", "getShowOverflowMenu", "showHeaderActions", "getShowHeaderActions", "showHeaderClose", "getShowHeaderClose", "showHeaderTitle", "getShowHeaderTitle", "showBetaLabel", "getShowBetaLabel", "showFullyExpandedSheet", "getShowFullyExpandedSheet", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantStatus;Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantMode;Lio/elevenlabs/domain/services/AssistantInteractionMode;ZZZZLjava/lang/String;FLio/elevenlabs/domain/model/AssistantConfig;ZLjava/lang/String;Ljava/util/List;ZZLjava/lang/Boolean;ZZZZZ)Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$State;", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class State {
        public static final int $stable = 8;
        private final AssistantConfig assistantConfig;
        private final boolean canSendFeedback;
        private final List<ChatMessage> chatMessages;
        private final String configError;
        private final String conversationId;
        private final boolean hasDeniedInitialPermissionPrompt;
        private final boolean hasRequestedInitialPermission;
        private final boolean hidePromptSuggestions;
        private final AssistantInteractionMode interactionMode;
        private final boolean isAssistantTyping;
        private final boolean isAudioMuted;
        private final boolean isMicMuted;
        private final boolean isTransitioning;
        private final float lastVadScore;
        private final Boolean micPermissionGranted;
        private final boolean micPermissionPermanentlyDenied;
        private final AssistantMode mode;
        private final boolean showExplainerMessage;
        private final boolean showOverflowMenu;
        private final boolean showTermsAcceptance;
        private final AssistantStatus status;

        public /* synthetic */ State(AssistantStatus assistantStatus, AssistantMode assistantMode, AssistantInteractionMode assistantInteractionMode, boolean z6, boolean z10, boolean z11, boolean z12, String str, float f10, AssistantConfig assistantConfig, boolean z13, String str2, List list, boolean z14, boolean z15, Boolean bool, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, int i10, kotlin.jvm.internal.f fVar) {
            this((i10 & 1) != 0 ? AssistantStatus.CONNECTING : assistantStatus, (i10 & 2) != 0 ? AssistantMode.LISTENING : assistantMode, (i10 & 4) != 0 ? AssistantInteractionMode.VOICE : assistantInteractionMode, (i10 & 8) != 0 ? true : z6, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? false : z11, (i10 & 64) != 0 ? false : z12, (i10 & 128) != 0 ? null : str, (i10 & RpcError.MAX_MESSAGE_BYTES) != 0 ? t2.u.P : f10, (i10 & 512) != 0 ? null : assistantConfig, (i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? false : z13, (i10 & 2048) != 0 ? null : str2, (i10 & 4096) != 0 ? tn.t.f33547a : list, (i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? false : z14, (i10 & 16384) != 0 ? false : z15, (i10 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? null : bool, (i10 & 65536) != 0 ? false : z16, (i10 & 131072) != 0 ? false : z17, (i10 & 262144) != 0 ? false : z18, (i10 & 524288) != 0 ? false : z19, (i10 & 1048576) != 0 ? false : z20);
        }

        public static /* synthetic */ State copy$default(State state, AssistantStatus assistantStatus, AssistantMode assistantMode, AssistantInteractionMode assistantInteractionMode, boolean z6, boolean z10, boolean z11, boolean z12, String str, float f10, AssistantConfig assistantConfig, boolean z13, String str2, List list, boolean z14, boolean z15, Boolean bool, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, int i10, Object obj) {
            boolean z21;
            boolean z22;
            AssistantStatus assistantStatus2 = (i10 & 1) != 0 ? state.status : assistantStatus;
            AssistantMode assistantMode2 = (i10 & 2) != 0 ? state.mode : assistantMode;
            AssistantInteractionMode assistantInteractionMode2 = (i10 & 4) != 0 ? state.interactionMode : assistantInteractionMode;
            boolean z23 = (i10 & 8) != 0 ? state.showExplainerMessage : z6;
            boolean z24 = (i10 & 16) != 0 ? state.canSendFeedback : z10;
            boolean z25 = (i10 & 32) != 0 ? state.isMicMuted : z11;
            boolean z26 = (i10 & 64) != 0 ? state.isAudioMuted : z12;
            String str3 = (i10 & 128) != 0 ? state.conversationId : str;
            float f11 = (i10 & RpcError.MAX_MESSAGE_BYTES) != 0 ? state.lastVadScore : f10;
            AssistantConfig assistantConfig2 = (i10 & 512) != 0 ? state.assistantConfig : assistantConfig;
            boolean z27 = (i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? state.hidePromptSuggestions : z13;
            String str4 = (i10 & 2048) != 0 ? state.configError : str2;
            List list2 = (i10 & 4096) != 0 ? state.chatMessages : list;
            boolean z28 = (i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? state.isAssistantTyping : z14;
            AssistantStatus assistantStatus3 = assistantStatus2;
            boolean z29 = (i10 & 16384) != 0 ? state.showTermsAcceptance : z15;
            Boolean bool2 = (i10 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? state.micPermissionGranted : bool;
            boolean z30 = (i10 & 65536) != 0 ? state.hasDeniedInitialPermissionPrompt : z16;
            boolean z31 = (i10 & 131072) != 0 ? state.micPermissionPermanentlyDenied : z17;
            boolean z32 = (i10 & 262144) != 0 ? state.hasRequestedInitialPermission : z18;
            boolean z33 = (i10 & 524288) != 0 ? state.showOverflowMenu : z19;
            if ((i10 & 1048576) != 0) {
                z22 = z33;
                z21 = state.isTransitioning;
            } else {
                z21 = z20;
                z22 = z33;
            }
            return state.copy(assistantStatus3, assistantMode2, assistantInteractionMode2, z23, z24, z25, z26, str3, f11, assistantConfig2, z27, str4, list2, z28, z29, bool2, z30, z31, z32, z22, z21);
        }

        /* renamed from: component1, reason: from getter */
        public final AssistantStatus getStatus() {
            return this.status;
        }

        /* renamed from: component10, reason: from getter */
        public final AssistantConfig getAssistantConfig() {
            return this.assistantConfig;
        }

        /* renamed from: component11, reason: from getter */
        public final boolean getHidePromptSuggestions() {
            return this.hidePromptSuggestions;
        }

        /* renamed from: component12, reason: from getter */
        public final String getConfigError() {
            return this.configError;
        }

        public final List<ChatMessage> component13() {
            return this.chatMessages;
        }

        /* renamed from: component14, reason: from getter */
        public final boolean getIsAssistantTyping() {
            return this.isAssistantTyping;
        }

        /* renamed from: component15, reason: from getter */
        public final boolean getShowTermsAcceptance() {
            return this.showTermsAcceptance;
        }

        /* renamed from: component16, reason: from getter */
        public final Boolean getMicPermissionGranted() {
            return this.micPermissionGranted;
        }

        /* renamed from: component17, reason: from getter */
        public final boolean getHasDeniedInitialPermissionPrompt() {
            return this.hasDeniedInitialPermissionPrompt;
        }

        /* renamed from: component18, reason: from getter */
        public final boolean getMicPermissionPermanentlyDenied() {
            return this.micPermissionPermanentlyDenied;
        }

        /* renamed from: component19, reason: from getter */
        public final boolean getHasRequestedInitialPermission() {
            return this.hasRequestedInitialPermission;
        }

        /* renamed from: component2, reason: from getter */
        public final AssistantMode getMode() {
            return this.mode;
        }

        /* renamed from: component20, reason: from getter */
        public final boolean getShowOverflowMenu() {
            return this.showOverflowMenu;
        }

        /* renamed from: component21, reason: from getter */
        public final boolean getIsTransitioning() {
            return this.isTransitioning;
        }

        /* renamed from: component3, reason: from getter */
        public final AssistantInteractionMode getInteractionMode() {
            return this.interactionMode;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShowExplainerMessage() {
            return this.showExplainerMessage;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getCanSendFeedback() {
            return this.canSendFeedback;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsMicMuted() {
            return this.isMicMuted;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getIsAudioMuted() {
            return this.isAudioMuted;
        }

        /* renamed from: component8, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        /* renamed from: component9, reason: from getter */
        public final float getLastVadScore() {
            return this.lastVadScore;
        }

        public final State copy(AssistantStatus status, AssistantMode mode, AssistantInteractionMode interactionMode, boolean showExplainerMessage, boolean canSendFeedback, boolean isMicMuted, boolean isAudioMuted, String conversationId, float lastVadScore, AssistantConfig assistantConfig, boolean hidePromptSuggestions, String configError, List<ChatMessage> chatMessages, boolean isAssistantTyping, boolean showTermsAcceptance, Boolean micPermissionGranted, boolean hasDeniedInitialPermissionPrompt, boolean micPermissionPermanentlyDenied, boolean hasRequestedInitialPermission, boolean showOverflowMenu, boolean isTransitioning) {
            status.getClass();
            mode.getClass();
            interactionMode.getClass();
            chatMessages.getClass();
            return new State(status, mode, interactionMode, showExplainerMessage, canSendFeedback, isMicMuted, isAudioMuted, conversationId, lastVadScore, assistantConfig, hidePromptSuggestions, configError, chatMessages, isAssistantTyping, showTermsAcceptance, micPermissionGranted, hasDeniedInitialPermissionPrompt, micPermissionPermanentlyDenied, hasRequestedInitialPermission, showOverflowMenu, isTransitioning);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            if (this.status == state.status && this.mode == state.mode && this.interactionMode == state.interactionMode && this.showExplainerMessage == state.showExplainerMessage && this.canSendFeedback == state.canSendFeedback && this.isMicMuted == state.isMicMuted && this.isAudioMuted == state.isAudioMuted && kotlin.jvm.internal.m.c(this.conversationId, state.conversationId) && Float.compare(this.lastVadScore, state.lastVadScore) == 0 && kotlin.jvm.internal.m.c(this.assistantConfig, state.assistantConfig) && this.hidePromptSuggestions == state.hidePromptSuggestions && kotlin.jvm.internal.m.c(this.configError, state.configError) && kotlin.jvm.internal.m.c(this.chatMessages, state.chatMessages) && this.isAssistantTyping == state.isAssistantTyping && this.showTermsAcceptance == state.showTermsAcceptance && kotlin.jvm.internal.m.c(this.micPermissionGranted, state.micPermissionGranted) && this.hasDeniedInitialPermissionPrompt == state.hasDeniedInitialPermissionPrompt && this.micPermissionPermanentlyDenied == state.micPermissionPermanentlyDenied && this.hasRequestedInitialPermission == state.hasRequestedInitialPermission && this.showOverflowMenu == state.showOverflowMenu && this.isTransitioning == state.isTransitioning) {
                return true;
            }
            return false;
        }

        public final AssistantConfig getAssistantConfig() {
            return this.assistantConfig;
        }

        public final boolean getCanSendFeedback() {
            return this.canSendFeedback;
        }

        public final List<ChatMessage> getChatMessages() {
            return this.chatMessages;
        }

        public final String getConfigError() {
            return this.configError;
        }

        public final String getConversationId() {
            return this.conversationId;
        }

        public final boolean getHasDeniedInitialPermissionPrompt() {
            return this.hasDeniedInitialPermissionPrompt;
        }

        public final boolean getHasRequestedInitialPermission() {
            return this.hasRequestedInitialPermission;
        }

        public final boolean getHidePromptSuggestions() {
            return this.hidePromptSuggestions;
        }

        public final AssistantInteractionMode getInteractionMode() {
            return this.interactionMode;
        }

        public final float getLastVadScore() {
            return this.lastVadScore;
        }

        public final Boolean getMicPermissionGranted() {
            return this.micPermissionGranted;
        }

        public final boolean getMicPermissionPermanentlyDenied() {
            return this.micPermissionPermanentlyDenied;
        }

        public final AssistantMode getMode() {
            return this.mode;
        }

        public final boolean getShowBetaLabel() {
            if (!this.showExplainerMessage && !this.showTermsAcceptance) {
                return true;
            }
            return false;
        }

        public final boolean getShowExplainerMessage() {
            return this.showExplainerMessage;
        }

        public final boolean getShowFullyExpandedSheet() {
            if (!this.showExplainerMessage && !this.showTermsAcceptance) {
                return true;
            }
            return false;
        }

        public final boolean getShowHeaderActions() {
            if (this.status == AssistantStatus.CONNECTED && !this.showExplainerMessage && !this.showTermsAcceptance) {
                return true;
            }
            return false;
        }

        public final boolean getShowHeaderClose() {
            return !this.showTermsAcceptance;
        }

        public final boolean getShowHeaderTitle() {
            if (!this.showExplainerMessage && !this.showTermsAcceptance) {
                return true;
            }
            return false;
        }

        public final boolean getShowOverflowMenu() {
            return this.showOverflowMenu;
        }

        public final boolean getShowTermsAcceptance() {
            return this.showTermsAcceptance;
        }

        public final AssistantStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int f10 = com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f((this.interactionMode.hashCode() + ((this.mode.hashCode() + (this.status.hashCode() * 31)) * 31)) * 31, 31, this.showExplainerMessage), 31, this.canSendFeedback), 31, this.isMicMuted), 31, this.isAudioMuted);
            String str = this.conversationId;
            int i10 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int c5 = com.google.android.gms.internal.play_billing.b.c(this.lastVadScore, (f10 + hashCode) * 31, 31);
            AssistantConfig assistantConfig = this.assistantConfig;
            if (assistantConfig == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = assistantConfig.hashCode();
            }
            int f11 = com.google.android.gms.internal.play_billing.b.f((c5 + hashCode2) * 31, 31, this.hidePromptSuggestions);
            String str2 = this.configError;
            if (str2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str2.hashCode();
            }
            int f12 = com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f(p.n.d((f11 + hashCode3) * 31, 31, this.chatMessages), 31, this.isAssistantTyping), 31, this.showTermsAcceptance);
            Boolean bool = this.micPermissionGranted;
            if (bool != null) {
                i10 = bool.hashCode();
            }
            return Boolean.hashCode(this.isTransitioning) + com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f((f12 + i10) * 31, 31, this.hasDeniedInitialPermissionPrompt), 31, this.micPermissionPermanentlyDenied), 31, this.hasRequestedInitialPermission), 31, this.showOverflowMenu);
        }

        public final boolean isAssistantTyping() {
            return this.isAssistantTyping;
        }

        public final boolean isAudioMuted() {
            return this.isAudioMuted;
        }

        public final boolean isMicMuted() {
            return this.isMicMuted;
        }

        public final boolean isTransitioning() {
            return this.isTransitioning;
        }

        public String toString() {
            AssistantStatus assistantStatus = this.status;
            AssistantMode assistantMode = this.mode;
            AssistantInteractionMode assistantInteractionMode = this.interactionMode;
            boolean z6 = this.showExplainerMessage;
            boolean z10 = this.canSendFeedback;
            boolean z11 = this.isMicMuted;
            boolean z12 = this.isAudioMuted;
            String str = this.conversationId;
            float f10 = this.lastVadScore;
            AssistantConfig assistantConfig = this.assistantConfig;
            boolean z13 = this.hidePromptSuggestions;
            String str2 = this.configError;
            List<ChatMessage> list = this.chatMessages;
            boolean z14 = this.isAssistantTyping;
            boolean z15 = this.showTermsAcceptance;
            Boolean bool = this.micPermissionGranted;
            boolean z16 = this.hasDeniedInitialPermissionPrompt;
            boolean z17 = this.micPermissionPermanentlyDenied;
            boolean z18 = this.hasRequestedInitialPermission;
            boolean z19 = this.showOverflowMenu;
            boolean z20 = this.isTransitioning;
            StringBuilder sb = new StringBuilder("State(status=");
            sb.append(assistantStatus);
            sb.append(", mode=");
            sb.append(assistantMode);
            sb.append(", interactionMode=");
            sb.append(assistantInteractionMode);
            sb.append(", showExplainerMessage=");
            sb.append(z6);
            sb.append(", canSendFeedback=");
            ib.i.t(sb, z10, ", isMicMuted=", z11, ", isAudioMuted=");
            defpackage.f.z(sb, z12, ", conversationId=", str, ", lastVadScore=");
            sb.append(f10);
            sb.append(", assistantConfig=");
            sb.append(assistantConfig);
            sb.append(", hidePromptSuggestions=");
            defpackage.f.z(sb, z13, ", configError=", str2, ", chatMessages=");
            sb.append(list);
            sb.append(", isAssistantTyping=");
            sb.append(z14);
            sb.append(", showTermsAcceptance=");
            sb.append(z15);
            sb.append(", micPermissionGranted=");
            sb.append(bool);
            sb.append(", hasDeniedInitialPermissionPrompt=");
            ib.i.t(sb, z16, ", micPermissionPermanentlyDenied=", z17, ", hasRequestedInitialPermission=");
            ib.i.t(sb, z18, ", showOverflowMenu=", z19, ", isTransitioning=");
            return p.n.j(Separators.RPAREN, sb, z20);
        }

        public State(AssistantStatus assistantStatus, AssistantMode assistantMode, AssistantInteractionMode assistantInteractionMode, boolean z6, boolean z10, boolean z11, boolean z12, String str, float f10, AssistantConfig assistantConfig, boolean z13, String str2, List<ChatMessage> list, boolean z14, boolean z15, Boolean bool, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20) {
            assistantStatus.getClass();
            assistantMode.getClass();
            assistantInteractionMode.getClass();
            list.getClass();
            this.status = assistantStatus;
            this.mode = assistantMode;
            this.interactionMode = assistantInteractionMode;
            this.showExplainerMessage = z6;
            this.canSendFeedback = z10;
            this.isMicMuted = z11;
            this.isAudioMuted = z12;
            this.conversationId = str;
            this.lastVadScore = f10;
            this.assistantConfig = assistantConfig;
            this.hidePromptSuggestions = z13;
            this.configError = str2;
            this.chatMessages = list;
            this.isAssistantTyping = z14;
            this.showTermsAcceptance = z15;
            this.micPermissionGranted = bool;
            this.hasDeniedInitialPermissionPrompt = z16;
            this.micPermissionPermanentlyDenied = z17;
            this.hasRequestedInitialPermission = z18;
            this.showOverflowMenu = z19;
            this.isTransitioning = z20;
        }

        public State() {
            this(null, null, null, false, false, false, false, null, t2.u.P, null, false, null, null, false, false, null, false, false, false, false, false, 2097151, null);
        }
    }
}
