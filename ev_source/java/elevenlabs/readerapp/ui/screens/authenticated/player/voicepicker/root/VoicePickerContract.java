package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import tn.o;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract;", "", "ViewType", "State", "FilterAndSearchMenuState", "TabsState", SIPHeaderNames.EVENT, "ControlEvent", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public interface VoicePickerContract {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$ControlEvent;", "", "CloseScreen", "NavigateToVoiceCollection", "NavigateToVoiceDesign", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$ControlEvent$CloseScreen;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$ControlEvent$NavigateToVoiceCollection;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$ControlEvent$NavigateToVoiceDesign;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface ControlEvent {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$ControlEvent$CloseScreen;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$ControlEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class CloseScreen implements ControlEvent {
            public static final int $stable = 0;
            public static final CloseScreen INSTANCE = new CloseScreen();

            private CloseScreen() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof CloseScreen)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1350204207;
            }

            public String toString() {
                return "CloseScreen";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$ControlEvent$NavigateToVoiceCollection;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$ControlEvent;", "collectionId", "", "<init>", "(Ljava/lang/String;)V", "getCollectionId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class NavigateToVoiceCollection implements ControlEvent {
            public static final int $stable = 0;
            private final String collectionId;

            public NavigateToVoiceCollection(String str) {
                str.getClass();
                this.collectionId = str;
            }

            public static /* synthetic */ NavigateToVoiceCollection copy$default(NavigateToVoiceCollection navigateToVoiceCollection, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = navigateToVoiceCollection.collectionId;
                }
                return navigateToVoiceCollection.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getCollectionId() {
                return this.collectionId;
            }

            public final NavigateToVoiceCollection copy(String collectionId) {
                collectionId.getClass();
                return new NavigateToVoiceCollection(collectionId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof NavigateToVoiceCollection) && kotlin.jvm.internal.m.c(this.collectionId, ((NavigateToVoiceCollection) other).collectionId)) {
                    return true;
                }
                return false;
            }

            public final String getCollectionId() {
                return this.collectionId;
            }

            public int hashCode() {
                return this.collectionId.hashCode();
            }

            public String toString() {
                return defpackage.f.C("NavigateToVoiceCollection(collectionId=", this.collectionId, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$ControlEvent$NavigateToVoiceDesign;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$ControlEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class NavigateToVoiceDesign implements ControlEvent {
            public static final int $stable = 0;
            public static final NavigateToVoiceDesign INSTANCE = new NavigateToVoiceDesign();

            private NavigateToVoiceDesign() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof NavigateToVoiceDesign)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 147165745;
            }

            public String toString() {
                return "NavigateToVoiceDesign";
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$Event;", "", "SelectTab", "Reset", "Save", "Close", "Initialize", "VoiceCreated", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$Event$Close;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$Event$Initialize;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$Event$Reset;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$Event$Save;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$Event$SelectTab;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$Event$VoiceCreated;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface Event {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$Event$Close;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
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
                return 890187558;
            }

            public String toString() {
                return "Close";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$Event$Initialize;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$Event;", "mode", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerMode;", "<init>", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerMode;)V", "getMode", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerMode;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class Initialize implements Event {
            public static final int $stable = 8;
            private final VoicePickerMode mode;

            public Initialize(VoicePickerMode voicePickerMode) {
                voicePickerMode.getClass();
                this.mode = voicePickerMode;
            }

            public static /* synthetic */ Initialize copy$default(Initialize initialize, VoicePickerMode voicePickerMode, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    voicePickerMode = initialize.mode;
                }
                return initialize.copy(voicePickerMode);
            }

            /* renamed from: component1, reason: from getter */
            public final VoicePickerMode getMode() {
                return this.mode;
            }

            public final Initialize copy(VoicePickerMode mode) {
                mode.getClass();
                return new Initialize(mode);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof Initialize) && kotlin.jvm.internal.m.c(this.mode, ((Initialize) other).mode)) {
                    return true;
                }
                return false;
            }

            public final VoicePickerMode getMode() {
                return this.mode;
            }

            public int hashCode() {
                return this.mode.hashCode();
            }

            public String toString() {
                return "Initialize(mode=" + this.mode + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$Event$Reset;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class Reset implements Event {
            public static final int $stable = 0;
            public static final Reset INSTANCE = new Reset();

            private Reset() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof Reset)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 903835261;
            }

            public String toString() {
                return "Reset";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$Event$Save;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class Save implements Event {
            public static final int $stable = 0;
            public static final Save INSTANCE = new Save();

            private Save() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof Save)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1494838641;
            }

            public String toString() {
                return "Save";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$Event$SelectTab;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$Event;", "tab", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerTab;", "<init>", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerTab;)V", "getTab", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerTab;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class SelectTab implements Event {
            public static final int $stable = 0;
            private final VoicePickerTab tab;

            public SelectTab(VoicePickerTab voicePickerTab) {
                voicePickerTab.getClass();
                this.tab = voicePickerTab;
            }

            public static /* synthetic */ SelectTab copy$default(SelectTab selectTab, VoicePickerTab voicePickerTab, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    voicePickerTab = selectTab.tab;
                }
                return selectTab.copy(voicePickerTab);
            }

            /* renamed from: component1, reason: from getter */
            public final VoicePickerTab getTab() {
                return this.tab;
            }

            public final SelectTab copy(VoicePickerTab tab) {
                tab.getClass();
                return new SelectTab(tab);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof SelectTab) && this.tab == ((SelectTab) other).tab) {
                    return true;
                }
                return false;
            }

            public final VoicePickerTab getTab() {
                return this.tab;
            }

            public int hashCode() {
                return this.tab.hashCode();
            }

            public String toString() {
                return "SelectTab(tab=" + this.tab + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$Event$VoiceCreated;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$Event;", "voiceId", "", "<init>", "(Ljava/lang/String;)V", "getVoiceId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class VoiceCreated implements Event {
            public static final int $stable = 0;
            private final String voiceId;

            public VoiceCreated(String str) {
                str.getClass();
                this.voiceId = str;
            }

            public static /* synthetic */ VoiceCreated copy$default(VoiceCreated voiceCreated, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = voiceCreated.voiceId;
                }
                return voiceCreated.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getVoiceId() {
                return this.voiceId;
            }

            public final VoiceCreated copy(String voiceId) {
                voiceId.getClass();
                return new VoiceCreated(voiceId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof VoiceCreated) && kotlin.jvm.internal.m.c(this.voiceId, ((VoiceCreated) other).voiceId)) {
                    return true;
                }
                return false;
            }

            public final String getVoiceId() {
                return this.voiceId;
            }

            public int hashCode() {
                return this.voiceId.hashCode();
            }

            public String toString() {
                return defpackage.f.C("VoiceCreated(voiceId=", this.voiceId, Separators.RPAREN);
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$FilterAndSearchMenuState;", "", "Initial", "Hidden", "Shown", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$FilterAndSearchMenuState$Hidden;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$FilterAndSearchMenuState$Initial;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$FilterAndSearchMenuState$Shown;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface FilterAndSearchMenuState {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$FilterAndSearchMenuState$Hidden;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$FilterAndSearchMenuState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class Hidden implements FilterAndSearchMenuState {
            public static final int $stable = 0;
            public static final Hidden INSTANCE = new Hidden();

            private Hidden() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof Hidden)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 547987791;
            }

            public String toString() {
                return "Hidden";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$FilterAndSearchMenuState$Initial;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$FilterAndSearchMenuState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class Initial implements FilterAndSearchMenuState {
            public static final int $stable = 0;
            public static final Initial INSTANCE = new Initial();

            private Initial() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof Initial)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 843499583;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$FilterAndSearchMenuState$Shown;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$FilterAndSearchMenuState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class Shown implements FilterAndSearchMenuState {
            public static final int $stable = 0;
            public static final Shown INSTANCE = new Shown();

            private Shown() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof Shown)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1136195788;
            }

            public String toString() {
                return "Shown";
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$ViewType;", "", "<init>", "()V", "VOICE_ROW", "", "FEATURED_VOICES_HORIZONTAL_LIST", "COLLECTIONS_HORIZONTAL_LIST", "SECTION_TITLE", "VOICES_HORIZONTAL_LIST", "VOICE_PAGINATION_LOADING_SHIMMER", "LIST_BOTTOM_SPACER", "VOICE_DESIGN_ROW", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class ViewType {
        public static final int $stable = 0;
        public static final String COLLECTIONS_HORIZONTAL_LIST = "voice_picker_view_type_collections_horizontal_list";
        public static final String FEATURED_VOICES_HORIZONTAL_LIST = "voice_picker_view_type_featured_voices_horizontal_list";
        public static final ViewType INSTANCE = new ViewType();
        public static final String LIST_BOTTOM_SPACER = "voice_picker_view_type_list_bottom_spacer";
        public static final String SECTION_TITLE = "voice_picker_view_type_section_title";
        public static final String VOICES_HORIZONTAL_LIST = "voice_picker_view_type_voices_horizontal_list";
        public static final String VOICE_DESIGN_ROW = "voice_picker_view_type_voice_design_row";
        public static final String VOICE_PAGINATION_LOADING_SHIMMER = "voice_picker_view_type_voice_pagination_loading_shimmer";
        public static final String VOICE_ROW = "voice_picker_view_type_voice_row";

        private ViewType() {
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$TabsState;", "", "Hidden", "Visible", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$TabsState$Hidden;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$TabsState$Visible;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface TabsState {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$TabsState$Hidden;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$TabsState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class Hidden implements TabsState {
            public static final int $stable = 0;
            public static final Hidden INSTANCE = new Hidden();

            private Hidden() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof Hidden)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1802635267;
            }

            public String toString() {
                return "Hidden";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$TabsState$Visible;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$TabsState;", "activeTab", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerTab;", "tabs", "", "<init>", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerTab;Ljava/util/List;)V", "getActiveTab", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerTab;", "getTabs", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class Visible implements TabsState {
            private final VoicePickerTab activeTab;
            private final List<VoicePickerTab> tabs;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final int $stable = 8;

            /* JADX WARN: Multi-variable type inference failed */
            public Visible(VoicePickerTab voicePickerTab, List<? extends VoicePickerTab> list) {
                voicePickerTab.getClass();
                list.getClass();
                this.activeTab = voicePickerTab;
                this.tabs = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Visible copy$default(Visible visible, VoicePickerTab voicePickerTab, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    voicePickerTab = visible.activeTab;
                }
                if ((i10 & 2) != 0) {
                    list = visible.tabs;
                }
                return visible.copy(voicePickerTab, list);
            }

            /* renamed from: component1, reason: from getter */
            public final VoicePickerTab getActiveTab() {
                return this.activeTab;
            }

            public final List<VoicePickerTab> component2() {
                return this.tabs;
            }

            public final Visible copy(VoicePickerTab activeTab, List<? extends VoicePickerTab> tabs) {
                activeTab.getClass();
                tabs.getClass();
                return new Visible(activeTab, tabs);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Visible)) {
                    return false;
                }
                Visible visible = (Visible) other;
                if (this.activeTab == visible.activeTab && kotlin.jvm.internal.m.c(this.tabs, visible.tabs)) {
                    return true;
                }
                return false;
            }

            public final VoicePickerTab getActiveTab() {
                return this.activeTab;
            }

            public final List<VoicePickerTab> getTabs() {
                return this.tabs;
            }

            public int hashCode() {
                return this.tabs.hashCode() + (this.activeTab.hashCode() * 31);
            }

            public String toString() {
                return "Visible(activeTab=" + this.activeTab + ", tabs=" + this.tabs + Separators.RPAREN;
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$TabsState$Visible$Companion;", "", "<init>", "()V", "initialState", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$TabsState$Visible;", "activeTab", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerTab;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes4.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final Visible initialState(VoicePickerTab activeTab) {
                    activeTab.getClass();
                    return new Visible(activeTab, o.g1(VoicePickerTab.getEntries()));
                }

                private Companion() {
                }
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$State;", "", "tabs", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$TabsState;", "filterAndSearchMenu", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$FilterAndSearchMenuState;", "isSaveLoading", "", "<init>", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$TabsState;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$FilterAndSearchMenuState;Z)V", "getTabs", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$TabsState;", "getFilterAndSearchMenu", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$FilterAndSearchMenuState;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class State {
        public static final int $stable = 0;
        private final FilterAndSearchMenuState filterAndSearchMenu;
        private final boolean isSaveLoading;
        private final TabsState tabs;

        public State(TabsState tabsState, FilterAndSearchMenuState filterAndSearchMenuState, boolean z6) {
            tabsState.getClass();
            filterAndSearchMenuState.getClass();
            this.tabs = tabsState;
            this.filterAndSearchMenu = filterAndSearchMenuState;
            this.isSaveLoading = z6;
        }

        public static /* synthetic */ State copy$default(State state, TabsState tabsState, FilterAndSearchMenuState filterAndSearchMenuState, boolean z6, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                tabsState = state.tabs;
            }
            if ((i10 & 2) != 0) {
                filterAndSearchMenuState = state.filterAndSearchMenu;
            }
            if ((i10 & 4) != 0) {
                z6 = state.isSaveLoading;
            }
            return state.copy(tabsState, filterAndSearchMenuState, z6);
        }

        /* renamed from: component1, reason: from getter */
        public final TabsState getTabs() {
            return this.tabs;
        }

        /* renamed from: component2, reason: from getter */
        public final FilterAndSearchMenuState getFilterAndSearchMenu() {
            return this.filterAndSearchMenu;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsSaveLoading() {
            return this.isSaveLoading;
        }

        public final State copy(TabsState tabs, FilterAndSearchMenuState filterAndSearchMenu, boolean isSaveLoading) {
            tabs.getClass();
            filterAndSearchMenu.getClass();
            return new State(tabs, filterAndSearchMenu, isSaveLoading);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            if (kotlin.jvm.internal.m.c(this.tabs, state.tabs) && kotlin.jvm.internal.m.c(this.filterAndSearchMenu, state.filterAndSearchMenu) && this.isSaveLoading == state.isSaveLoading) {
                return true;
            }
            return false;
        }

        public final FilterAndSearchMenuState getFilterAndSearchMenu() {
            return this.filterAndSearchMenu;
        }

        public final TabsState getTabs() {
            return this.tabs;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isSaveLoading) + ((this.filterAndSearchMenu.hashCode() + (this.tabs.hashCode() * 31)) * 31);
        }

        public final boolean isSaveLoading() {
            return this.isSaveLoading;
        }

        public String toString() {
            TabsState tabsState = this.tabs;
            FilterAndSearchMenuState filterAndSearchMenuState = this.filterAndSearchMenu;
            boolean z6 = this.isSaveLoading;
            StringBuilder sb = new StringBuilder("State(tabs=");
            sb.append(tabsState);
            sb.append(", filterAndSearchMenu=");
            sb.append(filterAndSearchMenuState);
            sb.append(", isSaveLoading=");
            return p.n.j(Separators.RPAREN, sb, z6);
        }

        public /* synthetic */ State(TabsState tabsState, FilterAndSearchMenuState filterAndSearchMenuState, boolean z6, int i10, kotlin.jvm.internal.f fVar) {
            this(tabsState, (i10 & 2) != 0 ? FilterAndSearchMenuState.Initial.INSTANCE : filterAndSearchMenuState, (i10 & 4) != 0 ? false : z6);
        }
    }
}
