package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.c6;
import io.elevenlabs.domain.model.EffectivePlaybackModeKt;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadMetaKt;
import io.elevenlabs.domain.model.ReadSource;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.domain.model.VoiceCollection;
import io.elevenlabs.domain.model.VoiceSelectionConfig;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerMode;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.FiltersState;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.SelectFiltersEvent;
import io.livekit.android.rpc.RpcError;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import p.n;
import tn.v;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract;", "", "State", "ReadMetaState", "RemoveFavoriteConfirmationDialogState", "DeleteVoiceConfirmationDialogState", SIPHeaderNames.EVENT, "NavigationEvent", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public interface VoicePickerSharedContract {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$DeleteVoiceConfirmationDialogState;", "", "Hidden", "Shown", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$DeleteVoiceConfirmationDialogState$Hidden;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$DeleteVoiceConfirmationDialogState$Shown;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface DeleteVoiceConfirmationDialogState {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$DeleteVoiceConfirmationDialogState$Hidden;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$DeleteVoiceConfirmationDialogState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class Hidden implements DeleteVoiceConfirmationDialogState {
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
                return -92221227;
            }

            public String toString() {
                return "Hidden";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$DeleteVoiceConfirmationDialogState$Shown;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$DeleteVoiceConfirmationDialogState;", "voice", "Lio/elevenlabs/domain/model/Voice;", "<init>", "(Lio/elevenlabs/domain/model/Voice;)V", "getVoice", "()Lio/elevenlabs/domain/model/Voice;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class Shown implements DeleteVoiceConfirmationDialogState {
            public static final int $stable = 8;
            private final Voice voice;

            public Shown(Voice voice) {
                voice.getClass();
                this.voice = voice;
            }

            public static /* synthetic */ Shown copy$default(Shown shown, Voice voice, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    voice = shown.voice;
                }
                return shown.copy(voice);
            }

            /* renamed from: component1, reason: from getter */
            public final Voice getVoice() {
                return this.voice;
            }

            public final Shown copy(Voice voice) {
                voice.getClass();
                return new Shown(voice);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof Shown) && m.c(this.voice, ((Shown) other).voice)) {
                    return true;
                }
                return false;
            }

            public final Voice getVoice() {
                return this.voice;
            }

            public int hashCode() {
                return this.voice.hashCode();
            }

            public String toString() {
                return "Shown(voice=" + this.voice + Separators.RPAREN;
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0014\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0082\u0001\u0014\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()¨\u0006*À\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "", "Initialise", "SelectVoice", "PreviewVoice", "SelectOriginalAudio", "CancelVoicePreview", "ResetSelectedVoice", "UpdateFallbackVoiceId", "AddFavorite", "ConfirmRemoveFavorite", "DismissRemoveFavoriteConfirmation", "RemoveFavorite", "ConfirmDeleteVoice", "DismissDeleteVoiceConfirmation", "DeleteVoice", "UpdateSearchShown", "UpdateSearchQuery", "UpdateFilters", "UpdateFiltersDialogShown", "ResetBeforeClosing", "SetSelectedVoiceId", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event$AddFavorite;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event$CancelVoicePreview;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event$ConfirmDeleteVoice;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event$ConfirmRemoveFavorite;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event$DeleteVoice;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event$DismissDeleteVoiceConfirmation;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event$DismissRemoveFavoriteConfirmation;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event$Initialise;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event$PreviewVoice;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event$RemoveFavorite;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event$ResetBeforeClosing;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event$ResetSelectedVoice;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event$SelectOriginalAudio;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event$SelectVoice;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event$SetSelectedVoiceId;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event$UpdateFallbackVoiceId;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event$UpdateFilters;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event$UpdateFiltersDialogShown;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event$UpdateSearchQuery;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event$UpdateSearchShown;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface Event {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event$AddFavorite;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "voiceId", "", "<init>", "(Ljava/lang/String;)V", "getVoiceId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class AddFavorite implements Event {
            public static final int $stable = 0;
            private final String voiceId;

            public AddFavorite(String str) {
                str.getClass();
                this.voiceId = str;
            }

            public static /* synthetic */ AddFavorite copy$default(AddFavorite addFavorite, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = addFavorite.voiceId;
                }
                return addFavorite.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getVoiceId() {
                return this.voiceId;
            }

            public final AddFavorite copy(String voiceId) {
                voiceId.getClass();
                return new AddFavorite(voiceId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof AddFavorite) && m.c(this.voiceId, ((AddFavorite) other).voiceId)) {
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
                return defpackage.f.C("AddFavorite(voiceId=", this.voiceId, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event$CancelVoicePreview;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class CancelVoicePreview implements Event {
            public static final int $stable = 0;
            public static final CancelVoicePreview INSTANCE = new CancelVoicePreview();

            private CancelVoicePreview() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof CancelVoicePreview)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 447095834;
            }

            public String toString() {
                return "CancelVoicePreview";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event$ConfirmDeleteVoice;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "voice", "Lio/elevenlabs/domain/model/Voice;", "<init>", "(Lio/elevenlabs/domain/model/Voice;)V", "getVoice", "()Lio/elevenlabs/domain/model/Voice;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class ConfirmDeleteVoice implements Event {
            public static final int $stable = 8;
            private final Voice voice;

            public ConfirmDeleteVoice(Voice voice) {
                voice.getClass();
                this.voice = voice;
            }

            public static /* synthetic */ ConfirmDeleteVoice copy$default(ConfirmDeleteVoice confirmDeleteVoice, Voice voice, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    voice = confirmDeleteVoice.voice;
                }
                return confirmDeleteVoice.copy(voice);
            }

            /* renamed from: component1, reason: from getter */
            public final Voice getVoice() {
                return this.voice;
            }

            public final ConfirmDeleteVoice copy(Voice voice) {
                voice.getClass();
                return new ConfirmDeleteVoice(voice);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof ConfirmDeleteVoice) && m.c(this.voice, ((ConfirmDeleteVoice) other).voice)) {
                    return true;
                }
                return false;
            }

            public final Voice getVoice() {
                return this.voice;
            }

            public int hashCode() {
                return this.voice.hashCode();
            }

            public String toString() {
                return "ConfirmDeleteVoice(voice=" + this.voice + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event$ConfirmRemoveFavorite;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "voice", "Lio/elevenlabs/domain/model/Voice;", "<init>", "(Lio/elevenlabs/domain/model/Voice;)V", "getVoice", "()Lio/elevenlabs/domain/model/Voice;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class ConfirmRemoveFavorite implements Event {
            public static final int $stable = 8;
            private final Voice voice;

            public ConfirmRemoveFavorite(Voice voice) {
                voice.getClass();
                this.voice = voice;
            }

            public static /* synthetic */ ConfirmRemoveFavorite copy$default(ConfirmRemoveFavorite confirmRemoveFavorite, Voice voice, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    voice = confirmRemoveFavorite.voice;
                }
                return confirmRemoveFavorite.copy(voice);
            }

            /* renamed from: component1, reason: from getter */
            public final Voice getVoice() {
                return this.voice;
            }

            public final ConfirmRemoveFavorite copy(Voice voice) {
                voice.getClass();
                return new ConfirmRemoveFavorite(voice);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof ConfirmRemoveFavorite) && m.c(this.voice, ((ConfirmRemoveFavorite) other).voice)) {
                    return true;
                }
                return false;
            }

            public final Voice getVoice() {
                return this.voice;
            }

            public int hashCode() {
                return this.voice.hashCode();
            }

            public String toString() {
                return "ConfirmRemoveFavorite(voice=" + this.voice + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event$DeleteVoice;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "voiceId", "", "<init>", "(Ljava/lang/String;)V", "getVoiceId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class DeleteVoice implements Event {
            public static final int $stable = 0;
            private final String voiceId;

            public DeleteVoice(String str) {
                str.getClass();
                this.voiceId = str;
            }

            public static /* synthetic */ DeleteVoice copy$default(DeleteVoice deleteVoice, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = deleteVoice.voiceId;
                }
                return deleteVoice.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getVoiceId() {
                return this.voiceId;
            }

            public final DeleteVoice copy(String voiceId) {
                voiceId.getClass();
                return new DeleteVoice(voiceId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof DeleteVoice) && m.c(this.voiceId, ((DeleteVoice) other).voiceId)) {
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
                return defpackage.f.C("DeleteVoice(voiceId=", this.voiceId, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event$DismissDeleteVoiceConfirmation;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class DismissDeleteVoiceConfirmation implements Event {
            public static final int $stable = 0;
            public static final DismissDeleteVoiceConfirmation INSTANCE = new DismissDeleteVoiceConfirmation();

            private DismissDeleteVoiceConfirmation() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof DismissDeleteVoiceConfirmation)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1337459068;
            }

            public String toString() {
                return "DismissDeleteVoiceConfirmation";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event$DismissRemoveFavoriteConfirmation;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class DismissRemoveFavoriteConfirmation implements Event {
            public static final int $stable = 0;
            public static final DismissRemoveFavoriteConfirmation INSTANCE = new DismissRemoveFavoriteConfirmation();

            private DismissRemoveFavoriteConfirmation() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof DismissRemoveFavoriteConfirmation)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1188385077;
            }

            public String toString() {
                return "DismissRemoveFavoriteConfirmation";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event$Initialise;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "mode", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerMode;", "<init>", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerMode;)V", "getMode", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerMode;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class Initialise implements Event {
            public static final int $stable = 8;
            private final VoicePickerMode mode;

            public Initialise(VoicePickerMode voicePickerMode) {
                voicePickerMode.getClass();
                this.mode = voicePickerMode;
            }

            public static /* synthetic */ Initialise copy$default(Initialise initialise, VoicePickerMode voicePickerMode, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    voicePickerMode = initialise.mode;
                }
                return initialise.copy(voicePickerMode);
            }

            /* renamed from: component1, reason: from getter */
            public final VoicePickerMode getMode() {
                return this.mode;
            }

            public final Initialise copy(VoicePickerMode mode) {
                mode.getClass();
                return new Initialise(mode);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof Initialise) && m.c(this.mode, ((Initialise) other).mode)) {
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
                return "Initialise(mode=" + this.mode + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event$PreviewVoice;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "voice", "Lio/elevenlabs/domain/model/Voice;", "markAsRecentIfSelected", "", "<init>", "(Lio/elevenlabs/domain/model/Voice;Z)V", "getVoice", "()Lio/elevenlabs/domain/model/Voice;", "getMarkAsRecentIfSelected", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class PreviewVoice implements Event {
            public static final int $stable = 8;
            private final boolean markAsRecentIfSelected;
            private final Voice voice;

            public PreviewVoice(Voice voice, boolean z6) {
                voice.getClass();
                this.voice = voice;
                this.markAsRecentIfSelected = z6;
            }

            public static /* synthetic */ PreviewVoice copy$default(PreviewVoice previewVoice, Voice voice, boolean z6, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    voice = previewVoice.voice;
                }
                if ((i10 & 2) != 0) {
                    z6 = previewVoice.markAsRecentIfSelected;
                }
                return previewVoice.copy(voice, z6);
            }

            /* renamed from: component1, reason: from getter */
            public final Voice getVoice() {
                return this.voice;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getMarkAsRecentIfSelected() {
                return this.markAsRecentIfSelected;
            }

            public final PreviewVoice copy(Voice voice, boolean markAsRecentIfSelected) {
                voice.getClass();
                return new PreviewVoice(voice, markAsRecentIfSelected);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PreviewVoice)) {
                    return false;
                }
                PreviewVoice previewVoice = (PreviewVoice) other;
                if (m.c(this.voice, previewVoice.voice) && this.markAsRecentIfSelected == previewVoice.markAsRecentIfSelected) {
                    return true;
                }
                return false;
            }

            public final boolean getMarkAsRecentIfSelected() {
                return this.markAsRecentIfSelected;
            }

            public final Voice getVoice() {
                return this.voice;
            }

            public int hashCode() {
                return Boolean.hashCode(this.markAsRecentIfSelected) + (this.voice.hashCode() * 31);
            }

            public String toString() {
                return "PreviewVoice(voice=" + this.voice + ", markAsRecentIfSelected=" + this.markAsRecentIfSelected + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event$RemoveFavorite;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "voiceId", "", "<init>", "(Ljava/lang/String;)V", "getVoiceId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class RemoveFavorite implements Event {
            public static final int $stable = 0;
            private final String voiceId;

            public RemoveFavorite(String str) {
                str.getClass();
                this.voiceId = str;
            }

            public static /* synthetic */ RemoveFavorite copy$default(RemoveFavorite removeFavorite, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = removeFavorite.voiceId;
                }
                return removeFavorite.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getVoiceId() {
                return this.voiceId;
            }

            public final RemoveFavorite copy(String voiceId) {
                voiceId.getClass();
                return new RemoveFavorite(voiceId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof RemoveFavorite) && m.c(this.voiceId, ((RemoveFavorite) other).voiceId)) {
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
                return defpackage.f.C("RemoveFavorite(voiceId=", this.voiceId, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event$ResetBeforeClosing;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class ResetBeforeClosing implements Event {
            public static final int $stable = 0;
            public static final ResetBeforeClosing INSTANCE = new ResetBeforeClosing();

            private ResetBeforeClosing() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof ResetBeforeClosing)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -6238863;
            }

            public String toString() {
                return "ResetBeforeClosing";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event$ResetSelectedVoice;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class ResetSelectedVoice implements Event {
            public static final int $stable = 0;
            public static final ResetSelectedVoice INSTANCE = new ResetSelectedVoice();

            private ResetSelectedVoice() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof ResetSelectedVoice)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 646716562;
            }

            public String toString() {
                return "ResetSelectedVoice";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event$SelectOriginalAudio;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class SelectOriginalAudio implements Event {
            public static final int $stable = 0;
            public static final SelectOriginalAudio INSTANCE = new SelectOriginalAudio();

            private SelectOriginalAudio() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof SelectOriginalAudio)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 166760415;
            }

            public String toString() {
                return "SelectOriginalAudio";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event$SelectVoice;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "voice", "Lio/elevenlabs/domain/model/Voice;", "markAsRecent", "", "<init>", "(Lio/elevenlabs/domain/model/Voice;Z)V", "getVoice", "()Lio/elevenlabs/domain/model/Voice;", "getMarkAsRecent", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class SelectVoice implements Event {
            public static final int $stable = 8;
            private final boolean markAsRecent;
            private final Voice voice;

            public SelectVoice(Voice voice, boolean z6) {
                voice.getClass();
                this.voice = voice;
                this.markAsRecent = z6;
            }

            public static /* synthetic */ SelectVoice copy$default(SelectVoice selectVoice, Voice voice, boolean z6, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    voice = selectVoice.voice;
                }
                if ((i10 & 2) != 0) {
                    z6 = selectVoice.markAsRecent;
                }
                return selectVoice.copy(voice, z6);
            }

            /* renamed from: component1, reason: from getter */
            public final Voice getVoice() {
                return this.voice;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getMarkAsRecent() {
                return this.markAsRecent;
            }

            public final SelectVoice copy(Voice voice, boolean markAsRecent) {
                voice.getClass();
                return new SelectVoice(voice, markAsRecent);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SelectVoice)) {
                    return false;
                }
                SelectVoice selectVoice = (SelectVoice) other;
                if (m.c(this.voice, selectVoice.voice) && this.markAsRecent == selectVoice.markAsRecent) {
                    return true;
                }
                return false;
            }

            public final boolean getMarkAsRecent() {
                return this.markAsRecent;
            }

            public final Voice getVoice() {
                return this.voice;
            }

            public int hashCode() {
                return Boolean.hashCode(this.markAsRecent) + (this.voice.hashCode() * 31);
            }

            public String toString() {
                return "SelectVoice(voice=" + this.voice + ", markAsRecent=" + this.markAsRecent + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event$SetSelectedVoiceId;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "voiceId", "", "<init>", "(Ljava/lang/String;)V", "getVoiceId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class SetSelectedVoiceId implements Event {
            public static final int $stable = 0;
            private final String voiceId;

            public SetSelectedVoiceId(String str) {
                str.getClass();
                this.voiceId = str;
            }

            public static /* synthetic */ SetSelectedVoiceId copy$default(SetSelectedVoiceId setSelectedVoiceId, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = setSelectedVoiceId.voiceId;
                }
                return setSelectedVoiceId.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getVoiceId() {
                return this.voiceId;
            }

            public final SetSelectedVoiceId copy(String voiceId) {
                voiceId.getClass();
                return new SetSelectedVoiceId(voiceId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof SetSelectedVoiceId) && m.c(this.voiceId, ((SetSelectedVoiceId) other).voiceId)) {
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
                return defpackage.f.C("SetSelectedVoiceId(voiceId=", this.voiceId, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event$UpdateFallbackVoiceId;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "voiceId", "", "<init>", "(Ljava/lang/String;)V", "getVoiceId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class UpdateFallbackVoiceId implements Event {
            public static final int $stable = 0;
            private final String voiceId;

            public UpdateFallbackVoiceId(String str) {
                str.getClass();
                this.voiceId = str;
            }

            public static /* synthetic */ UpdateFallbackVoiceId copy$default(UpdateFallbackVoiceId updateFallbackVoiceId, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = updateFallbackVoiceId.voiceId;
                }
                return updateFallbackVoiceId.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getVoiceId() {
                return this.voiceId;
            }

            public final UpdateFallbackVoiceId copy(String voiceId) {
                voiceId.getClass();
                return new UpdateFallbackVoiceId(voiceId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof UpdateFallbackVoiceId) && m.c(this.voiceId, ((UpdateFallbackVoiceId) other).voiceId)) {
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
                return defpackage.f.C("UpdateFallbackVoiceId(voiceId=", this.voiceId, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event$UpdateFilters;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "filters", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/SelectFiltersEvent;", "<init>", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/SelectFiltersEvent;)V", "getFilters", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/SelectFiltersEvent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class UpdateFilters implements Event {
            public static final int $stable = 8;
            private final SelectFiltersEvent filters;

            public UpdateFilters(SelectFiltersEvent selectFiltersEvent) {
                this.filters = selectFiltersEvent;
            }

            public static /* synthetic */ UpdateFilters copy$default(UpdateFilters updateFilters, SelectFiltersEvent selectFiltersEvent, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    selectFiltersEvent = updateFilters.filters;
                }
                return updateFilters.copy(selectFiltersEvent);
            }

            /* renamed from: component1, reason: from getter */
            public final SelectFiltersEvent getFilters() {
                return this.filters;
            }

            public final UpdateFilters copy(SelectFiltersEvent filters) {
                return new UpdateFilters(filters);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof UpdateFilters) && m.c(this.filters, ((UpdateFilters) other).filters)) {
                    return true;
                }
                return false;
            }

            public final SelectFiltersEvent getFilters() {
                return this.filters;
            }

            public int hashCode() {
                SelectFiltersEvent selectFiltersEvent = this.filters;
                if (selectFiltersEvent == null) {
                    return 0;
                }
                return selectFiltersEvent.hashCode();
            }

            public String toString() {
                return "UpdateFilters(filters=" + this.filters + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event$UpdateFiltersDialogShown;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "shown", "", "<init>", "(Z)V", "getShown", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class UpdateFiltersDialogShown implements Event {
            public static final int $stable = 0;
            private final boolean shown;

            public UpdateFiltersDialogShown(boolean z6) {
                this.shown = z6;
            }

            public static /* synthetic */ UpdateFiltersDialogShown copy$default(UpdateFiltersDialogShown updateFiltersDialogShown, boolean z6, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    z6 = updateFiltersDialogShown.shown;
                }
                return updateFiltersDialogShown.copy(z6);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getShown() {
                return this.shown;
            }

            public final UpdateFiltersDialogShown copy(boolean shown) {
                return new UpdateFiltersDialogShown(shown);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof UpdateFiltersDialogShown) && this.shown == ((UpdateFiltersDialogShown) other).shown) {
                    return true;
                }
                return false;
            }

            public final boolean getShown() {
                return this.shown;
            }

            public int hashCode() {
                return Boolean.hashCode(this.shown);
            }

            public String toString() {
                return "UpdateFiltersDialogShown(shown=" + this.shown + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event$UpdateSearchQuery;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "query", "", "<init>", "(Ljava/lang/String;)V", "getQuery", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class UpdateSearchQuery implements Event {
            public static final int $stable = 0;
            private final String query;

            public UpdateSearchQuery(String str) {
                this.query = str;
            }

            public static /* synthetic */ UpdateSearchQuery copy$default(UpdateSearchQuery updateSearchQuery, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = updateSearchQuery.query;
                }
                return updateSearchQuery.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getQuery() {
                return this.query;
            }

            public final UpdateSearchQuery copy(String query) {
                return new UpdateSearchQuery(query);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof UpdateSearchQuery) && m.c(this.query, ((UpdateSearchQuery) other).query)) {
                    return true;
                }
                return false;
            }

            public final String getQuery() {
                return this.query;
            }

            public int hashCode() {
                String str = this.query;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return defpackage.f.C("UpdateSearchQuery(query=", this.query, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event$UpdateSearchShown;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "shown", "", "<init>", "(Z)V", "getShown", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class UpdateSearchShown implements Event {
            public static final int $stable = 0;
            private final boolean shown;

            public UpdateSearchShown(boolean z6) {
                this.shown = z6;
            }

            public static /* synthetic */ UpdateSearchShown copy$default(UpdateSearchShown updateSearchShown, boolean z6, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    z6 = updateSearchShown.shown;
                }
                return updateSearchShown.copy(z6);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getShown() {
                return this.shown;
            }

            public final UpdateSearchShown copy(boolean shown) {
                return new UpdateSearchShown(shown);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof UpdateSearchShown) && this.shown == ((UpdateSearchShown) other).shown) {
                    return true;
                }
                return false;
            }

            public final boolean getShown() {
                return this.shown;
            }

            public int hashCode() {
                return Boolean.hashCode(this.shown);
            }

            public String toString() {
                return "UpdateSearchShown(shown=" + this.shown + Separators.RPAREN;
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$NavigationEvent;", "", "NavigateToVoiceCollection", "NavigateToVoiceDesign", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$NavigationEvent$NavigateToVoiceCollection;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$NavigationEvent$NavigateToVoiceDesign;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface NavigationEvent {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$NavigationEvent$NavigateToVoiceCollection;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$NavigationEvent;", "collection", "Lio/elevenlabs/domain/model/VoiceCollection;", "<init>", "(Lio/elevenlabs/domain/model/VoiceCollection;)V", "getCollection", "()Lio/elevenlabs/domain/model/VoiceCollection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class NavigateToVoiceCollection implements NavigationEvent {
            public static final int $stable = 8;
            private final VoiceCollection collection;

            public NavigateToVoiceCollection(VoiceCollection voiceCollection) {
                voiceCollection.getClass();
                this.collection = voiceCollection;
            }

            public static /* synthetic */ NavigateToVoiceCollection copy$default(NavigateToVoiceCollection navigateToVoiceCollection, VoiceCollection voiceCollection, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    voiceCollection = navigateToVoiceCollection.collection;
                }
                return navigateToVoiceCollection.copy(voiceCollection);
            }

            /* renamed from: component1, reason: from getter */
            public final VoiceCollection getCollection() {
                return this.collection;
            }

            public final NavigateToVoiceCollection copy(VoiceCollection collection) {
                collection.getClass();
                return new NavigateToVoiceCollection(collection);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof NavigateToVoiceCollection) && m.c(this.collection, ((NavigateToVoiceCollection) other).collection)) {
                    return true;
                }
                return false;
            }

            public final VoiceCollection getCollection() {
                return this.collection;
            }

            public int hashCode() {
                return this.collection.hashCode();
            }

            public String toString() {
                return "NavigateToVoiceCollection(collection=" + this.collection + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$NavigationEvent$NavigateToVoiceDesign;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$NavigationEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class NavigateToVoiceDesign implements NavigationEvent {
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
                return 422307942;
            }

            public String toString() {
                return "NavigateToVoiceDesign";
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$ReadMetaState;", "", "Initial", "Absent", "Present", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$ReadMetaState$Absent;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$ReadMetaState$Initial;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$ReadMetaState$Present;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface ReadMetaState {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$ReadMetaState$Absent;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$ReadMetaState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class Absent implements ReadMetaState {
            public static final int $stable = 0;
            public static final Absent INSTANCE = new Absent();

            private Absent() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof Absent)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -81777401;
            }

            public String toString() {
                return "Absent";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$ReadMetaState$Initial;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$ReadMetaState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class Initial implements ReadMetaState {
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
                return 604718902;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$ReadMetaState$Present;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$ReadMetaState;", "value", "Lio/elevenlabs/domain/model/ReadMeta;", "<init>", "(Lio/elevenlabs/domain/model/ReadMeta;)V", "getValue", "()Lio/elevenlabs/domain/model/ReadMeta;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class Present implements ReadMetaState {
            public static final int $stable = 8;
            private final ReadMeta value;

            public Present(ReadMeta readMeta) {
                readMeta.getClass();
                this.value = readMeta;
            }

            public static /* synthetic */ Present copy$default(Present present, ReadMeta readMeta, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    readMeta = present.value;
                }
                return present.copy(readMeta);
            }

            /* renamed from: component1, reason: from getter */
            public final ReadMeta getValue() {
                return this.value;
            }

            public final Present copy(ReadMeta value) {
                value.getClass();
                return new Present(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof Present) && m.c(this.value, ((Present) other).value)) {
                    return true;
                }
                return false;
            }

            public final ReadMeta getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Present(value=" + this.value + Separators.RPAREN;
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$RemoveFavoriteConfirmationDialogState;", "", "Hidden", "Shown", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$RemoveFavoriteConfirmationDialogState$Hidden;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$RemoveFavoriteConfirmationDialogState$Shown;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface RemoveFavoriteConfirmationDialogState {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$RemoveFavoriteConfirmationDialogState$Hidden;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$RemoveFavoriteConfirmationDialogState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class Hidden implements RemoveFavoriteConfirmationDialogState {
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
                return -1106038278;
            }

            public String toString() {
                return "Hidden";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$RemoveFavoriteConfirmationDialogState$Shown;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$RemoveFavoriteConfirmationDialogState;", "voice", "Lio/elevenlabs/domain/model/Voice;", "<init>", "(Lio/elevenlabs/domain/model/Voice;)V", "getVoice", "()Lio/elevenlabs/domain/model/Voice;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class Shown implements RemoveFavoriteConfirmationDialogState {
            public static final int $stable = 8;
            private final Voice voice;

            public Shown(Voice voice) {
                voice.getClass();
                this.voice = voice;
            }

            public static /* synthetic */ Shown copy$default(Shown shown, Voice voice, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    voice = shown.voice;
                }
                return shown.copy(voice);
            }

            /* renamed from: component1, reason: from getter */
            public final Voice getVoice() {
                return this.voice;
            }

            public final Shown copy(Voice voice) {
                voice.getClass();
                return new Shown(voice);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof Shown) && m.c(this.voice, ((Shown) other).voice)) {
                    return true;
                }
                return false;
            }

            public final Voice getVoice() {
                return this.voice;
            }

            public int hashCode() {
                return this.voice.hashCode();
            }

            public String toString() {
                return "Shown(voice=" + this.voice + Separators.RPAREN;
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010-\u001a\u00020\u000bJ\u0006\u0010.\u001a\u00020\u000bJ\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u00104\u001a\u00020\u000bHÆ\u0003J\t\u00105\u001a\u00020\rHÆ\u0003J\t\u00106\u001a\u00020\u000bHÆ\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010HÆ\u0003J\t\u00108\u001a\u00020\u0012HÆ\u0003J\t\u00109\u001a\u00020\u0014HÆ\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010HÆ\u0003J\t\u0010;\u001a\u00020\u000bHÆ\u0003J\u009f\u0001\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u000bHÆ\u0001J\u0014\u0010=\u001a\u00020\u000b2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010?\u001a\u00020@HÖ\u0081\u0004J\n\u0010A\u001a\u00020\u0007HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\b\n\u0000\u001a\u0004\b,\u0010'R\u0011\u0010\u0016\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\"¨\u0006B"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;", "", "mode", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerMode;", "readMeta", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$ReadMetaState;", "fallbackVoiceId", "", "selectedVoiceId", "playingPreviewVoiceId", "searchShown", "", "filters", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/FiltersState;", "filtersDialogShown", "favoriteChangeInProgressVoiceIds", "", "favoritesRemoveConfirmationState", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$RemoveFavoriteConfirmationDialogState;", "deleteVoiceConfirmationState", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$DeleteVoiceConfirmationDialogState;", "deleteVoiceInProgressIds", "isVoiceChangerEnabled", "<init>", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerMode;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$ReadMetaState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/elevenlabs/readerapp/ui/screens/authenticated/voices/FiltersState;ZLjava/util/Set;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$RemoveFavoriteConfirmationDialogState;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$DeleteVoiceConfirmationDialogState;Ljava/util/Set;Z)V", "getMode", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerMode;", "getReadMeta", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$ReadMetaState;", "getFallbackVoiceId", "()Ljava/lang/String;", "getSelectedVoiceId", "getPlayingPreviewVoiceId", "getSearchShown", "()Z", "getFilters", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/FiltersState;", "getFiltersDialogShown", "getFavoriteChangeInProgressVoiceIds", "()Ljava/util/Set;", "getFavoritesRemoveConfirmationState", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$RemoveFavoriteConfirmationDialogState;", "getDeleteVoiceConfirmationState", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$DeleteVoiceConfirmationDialogState;", "getDeleteVoiceInProgressIds", "canChangeVoices", "canShowAllVoiceTabs", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class State {
        public static final int $stable = 8;
        private final DeleteVoiceConfirmationDialogState deleteVoiceConfirmationState;
        private final Set<String> deleteVoiceInProgressIds;
        private final String fallbackVoiceId;
        private final Set<String> favoriteChangeInProgressVoiceIds;
        private final RemoveFavoriteConfirmationDialogState favoritesRemoveConfirmationState;
        private final FiltersState filters;
        private final boolean filtersDialogShown;
        private final boolean isVoiceChangerEnabled;
        private final VoicePickerMode mode;
        private final String playingPreviewVoiceId;
        private final ReadMetaState readMeta;
        private final boolean searchShown;
        private final String selectedVoiceId;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ State(VoicePickerMode voicePickerMode, ReadMetaState readMetaState, String str, String str2, String str3, boolean z6, FiltersState filtersState, boolean z10, Set set, RemoveFavoriteConfirmationDialogState removeFavoriteConfirmationDialogState, DeleteVoiceConfirmationDialogState deleteVoiceConfirmationDialogState, Set set2, boolean z11, int i10, kotlin.jvm.internal.f fVar) {
            this(r1, r3, r4, r5, r2, r6, r9, r8, r10, r12, r13, r11, r33);
            VoicePickerMode voicePickerMode2;
            ReadMetaState readMetaState2;
            String str4;
            String str5;
            boolean z12;
            FiltersState filtersState2;
            boolean z13;
            Set set3;
            RemoveFavoriteConfirmationDialogState removeFavoriteConfirmationDialogState2;
            DeleteVoiceConfirmationDialogState deleteVoiceConfirmationDialogState2;
            boolean z14;
            if ((i10 & 1) != 0) {
                voicePickerMode2 = null;
            } else {
                voicePickerMode2 = voicePickerMode;
            }
            if ((i10 & 2) != 0) {
                readMetaState2 = ReadMetaState.Initial.INSTANCE;
            } else {
                readMetaState2 = readMetaState;
            }
            if ((i10 & 4) != 0) {
                str4 = null;
            } else {
                str4 = str;
            }
            if ((i10 & 8) != 0) {
                str5 = null;
            } else {
                str5 = str2;
            }
            String str6 = (i10 & 16) == 0 ? str3 : null;
            if ((i10 & 32) != 0) {
                z12 = false;
            } else {
                z12 = z6;
            }
            if ((i10 & 64) != 0) {
                filtersState2 = new FiltersState(null, null, null, null, null, null, null, 127, null);
            } else {
                filtersState2 = filtersState;
            }
            if ((i10 & 128) != 0) {
                z13 = false;
            } else {
                z13 = z10;
            }
            int i11 = i10 & RpcError.MAX_MESSAGE_BYTES;
            Set set4 = v.f33549a;
            if (i11 != 0) {
                set3 = set4;
            } else {
                set3 = set;
            }
            if ((i10 & 512) != 0) {
                removeFavoriteConfirmationDialogState2 = RemoveFavoriteConfirmationDialogState.Hidden.INSTANCE;
            } else {
                removeFavoriteConfirmationDialogState2 = removeFavoriteConfirmationDialogState;
            }
            if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                deleteVoiceConfirmationDialogState2 = DeleteVoiceConfirmationDialogState.Hidden.INSTANCE;
            } else {
                deleteVoiceConfirmationDialogState2 = deleteVoiceConfirmationDialogState;
            }
            set4 = (i10 & 2048) == 0 ? set2 : set4;
            if ((i10 & 4096) != 0) {
                z14 = false;
            } else {
                z14 = z11;
            }
        }

        public static /* synthetic */ State copy$default(State state, VoicePickerMode voicePickerMode, ReadMetaState readMetaState, String str, String str2, String str3, boolean z6, FiltersState filtersState, boolean z10, Set set, RemoveFavoriteConfirmationDialogState removeFavoriteConfirmationDialogState, DeleteVoiceConfirmationDialogState deleteVoiceConfirmationDialogState, Set set2, boolean z11, int i10, Object obj) {
            ReadMetaState readMetaState2;
            String str4;
            String str5;
            String str6;
            boolean z12;
            FiltersState filtersState2;
            boolean z13;
            Set set3;
            RemoveFavoriteConfirmationDialogState removeFavoriteConfirmationDialogState2;
            DeleteVoiceConfirmationDialogState deleteVoiceConfirmationDialogState2;
            Set set4;
            boolean z14;
            if ((i10 & 1) != 0) {
                voicePickerMode = state.mode;
            }
            if ((i10 & 2) != 0) {
                readMetaState2 = state.readMeta;
            } else {
                readMetaState2 = readMetaState;
            }
            if ((i10 & 4) != 0) {
                str4 = state.fallbackVoiceId;
            } else {
                str4 = str;
            }
            if ((i10 & 8) != 0) {
                str5 = state.selectedVoiceId;
            } else {
                str5 = str2;
            }
            if ((i10 & 16) != 0) {
                str6 = state.playingPreviewVoiceId;
            } else {
                str6 = str3;
            }
            if ((i10 & 32) != 0) {
                z12 = state.searchShown;
            } else {
                z12 = z6;
            }
            if ((i10 & 64) != 0) {
                filtersState2 = state.filters;
            } else {
                filtersState2 = filtersState;
            }
            if ((i10 & 128) != 0) {
                z13 = state.filtersDialogShown;
            } else {
                z13 = z10;
            }
            if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
                set3 = state.favoriteChangeInProgressVoiceIds;
            } else {
                set3 = set;
            }
            if ((i10 & 512) != 0) {
                removeFavoriteConfirmationDialogState2 = state.favoritesRemoveConfirmationState;
            } else {
                removeFavoriteConfirmationDialogState2 = removeFavoriteConfirmationDialogState;
            }
            if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                deleteVoiceConfirmationDialogState2 = state.deleteVoiceConfirmationState;
            } else {
                deleteVoiceConfirmationDialogState2 = deleteVoiceConfirmationDialogState;
            }
            if ((i10 & 2048) != 0) {
                set4 = state.deleteVoiceInProgressIds;
            } else {
                set4 = set2;
            }
            if ((i10 & 4096) != 0) {
                z14 = state.isVoiceChangerEnabled;
            } else {
                z14 = z11;
            }
            return state.copy(voicePickerMode, readMetaState2, str4, str5, str6, z12, filtersState2, z13, set3, removeFavoriteConfirmationDialogState2, deleteVoiceConfirmationDialogState2, set4, z14);
        }

        public final boolean canChangeVoices() {
            ReadMetaState.Present present;
            ReadMeta value;
            ReadMetaState readMetaState = this.readMeta;
            if (readMetaState instanceof ReadMetaState.Present) {
                present = (ReadMetaState.Present) readMetaState;
            } else {
                present = null;
            }
            if (present == null || (value = present.getValue()) == null) {
                return true;
            }
            if (value.getSource() == ReadSource.Podcast) {
                return false;
            }
            if (ReadMetaKt.isMediaType(value)) {
                if (this.isVoiceChangerEnabled && ReadMetaKt.getSupportsVoiceChanger(value)) {
                    return true;
                }
                return false;
            }
            return !m.c(this.fallbackVoiceId, EffectivePlaybackModeKt.ORIGINAL_AUDIO);
        }

        public final boolean canShowAllVoiceTabs() {
            boolean z6;
            ReadMetaState readMetaState = this.readMeta;
            if ((readMetaState instanceof ReadMetaState.Initial) || (readMetaState instanceof ReadMetaState.Absent)) {
                return true;
            }
            if (readMetaState instanceof ReadMetaState.Present) {
                boolean isVoiceSelectionRestricted = ReadMetaKt.isVoiceSelectionRestricted(((ReadMetaState.Present) readMetaState).getValue());
                if (ReadMetaKt.isMediaType(((ReadMetaState.Present) this.readMeta).getValue()) && ((ReadMetaState.Present) this.readMeta).getValue().getVoiceSelectionConfig() != VoiceSelectionConfig.PreSelectedOnly && ((ReadMetaState.Present) this.readMeta).getValue().getSource() != ReadSource.Podcast && this.isVoiceChangerEnabled && ReadMetaKt.getSupportsVoiceChanger(((ReadMetaState.Present) this.readMeta).getValue())) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (!isVoiceSelectionRestricted || z6) {
                    return true;
                }
                return false;
            }
            c6.p();
            return false;
        }

        /* renamed from: component1, reason: from getter */
        public final VoicePickerMode getMode() {
            return this.mode;
        }

        /* renamed from: component10, reason: from getter */
        public final RemoveFavoriteConfirmationDialogState getFavoritesRemoveConfirmationState() {
            return this.favoritesRemoveConfirmationState;
        }

        /* renamed from: component11, reason: from getter */
        public final DeleteVoiceConfirmationDialogState getDeleteVoiceConfirmationState() {
            return this.deleteVoiceConfirmationState;
        }

        public final Set<String> component12() {
            return this.deleteVoiceInProgressIds;
        }

        /* renamed from: component13, reason: from getter */
        public final boolean getIsVoiceChangerEnabled() {
            return this.isVoiceChangerEnabled;
        }

        /* renamed from: component2, reason: from getter */
        public final ReadMetaState getReadMeta() {
            return this.readMeta;
        }

        /* renamed from: component3, reason: from getter */
        public final String getFallbackVoiceId() {
            return this.fallbackVoiceId;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSelectedVoiceId() {
            return this.selectedVoiceId;
        }

        /* renamed from: component5, reason: from getter */
        public final String getPlayingPreviewVoiceId() {
            return this.playingPreviewVoiceId;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getSearchShown() {
            return this.searchShown;
        }

        /* renamed from: component7, reason: from getter */
        public final FiltersState getFilters() {
            return this.filters;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getFiltersDialogShown() {
            return this.filtersDialogShown;
        }

        public final Set<String> component9() {
            return this.favoriteChangeInProgressVoiceIds;
        }

        public final State copy(VoicePickerMode mode, ReadMetaState readMeta, String fallbackVoiceId, String selectedVoiceId, String playingPreviewVoiceId, boolean searchShown, FiltersState filters, boolean filtersDialogShown, Set<String> favoriteChangeInProgressVoiceIds, RemoveFavoriteConfirmationDialogState favoritesRemoveConfirmationState, DeleteVoiceConfirmationDialogState deleteVoiceConfirmationState, Set<String> deleteVoiceInProgressIds, boolean isVoiceChangerEnabled) {
            readMeta.getClass();
            filters.getClass();
            favoriteChangeInProgressVoiceIds.getClass();
            favoritesRemoveConfirmationState.getClass();
            deleteVoiceConfirmationState.getClass();
            deleteVoiceInProgressIds.getClass();
            return new State(mode, readMeta, fallbackVoiceId, selectedVoiceId, playingPreviewVoiceId, searchShown, filters, filtersDialogShown, favoriteChangeInProgressVoiceIds, favoritesRemoveConfirmationState, deleteVoiceConfirmationState, deleteVoiceInProgressIds, isVoiceChangerEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            if (m.c(this.mode, state.mode) && m.c(this.readMeta, state.readMeta) && m.c(this.fallbackVoiceId, state.fallbackVoiceId) && m.c(this.selectedVoiceId, state.selectedVoiceId) && m.c(this.playingPreviewVoiceId, state.playingPreviewVoiceId) && this.searchShown == state.searchShown && m.c(this.filters, state.filters) && this.filtersDialogShown == state.filtersDialogShown && m.c(this.favoriteChangeInProgressVoiceIds, state.favoriteChangeInProgressVoiceIds) && m.c(this.favoritesRemoveConfirmationState, state.favoritesRemoveConfirmationState) && m.c(this.deleteVoiceConfirmationState, state.deleteVoiceConfirmationState) && m.c(this.deleteVoiceInProgressIds, state.deleteVoiceInProgressIds) && this.isVoiceChangerEnabled == state.isVoiceChangerEnabled) {
                return true;
            }
            return false;
        }

        public final DeleteVoiceConfirmationDialogState getDeleteVoiceConfirmationState() {
            return this.deleteVoiceConfirmationState;
        }

        public final Set<String> getDeleteVoiceInProgressIds() {
            return this.deleteVoiceInProgressIds;
        }

        public final String getFallbackVoiceId() {
            return this.fallbackVoiceId;
        }

        public final Set<String> getFavoriteChangeInProgressVoiceIds() {
            return this.favoriteChangeInProgressVoiceIds;
        }

        public final RemoveFavoriteConfirmationDialogState getFavoritesRemoveConfirmationState() {
            return this.favoritesRemoveConfirmationState;
        }

        public final FiltersState getFilters() {
            return this.filters;
        }

        public final boolean getFiltersDialogShown() {
            return this.filtersDialogShown;
        }

        public final VoicePickerMode getMode() {
            return this.mode;
        }

        public final String getPlayingPreviewVoiceId() {
            return this.playingPreviewVoiceId;
        }

        public final ReadMetaState getReadMeta() {
            return this.readMeta;
        }

        public final boolean getSearchShown() {
            return this.searchShown;
        }

        public final String getSelectedVoiceId() {
            return this.selectedVoiceId;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            VoicePickerMode voicePickerMode = this.mode;
            int i10 = 0;
            if (voicePickerMode == null) {
                hashCode = 0;
            } else {
                hashCode = voicePickerMode.hashCode();
            }
            int hashCode4 = (this.readMeta.hashCode() + (hashCode * 31)) * 31;
            String str = this.fallbackVoiceId;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int i11 = (hashCode4 + hashCode2) * 31;
            String str2 = this.selectedVoiceId;
            if (str2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str2.hashCode();
            }
            int i12 = (i11 + hashCode3) * 31;
            String str3 = this.playingPreviewVoiceId;
            if (str3 != null) {
                i10 = str3.hashCode();
            }
            return Boolean.hashCode(this.isVoiceChangerEnabled) + ((this.deleteVoiceInProgressIds.hashCode() + ((this.deleteVoiceConfirmationState.hashCode() + ((this.favoritesRemoveConfirmationState.hashCode() + ((this.favoriteChangeInProgressVoiceIds.hashCode() + com.google.android.gms.internal.play_billing.b.f((this.filters.hashCode() + com.google.android.gms.internal.play_billing.b.f((i12 + i10) * 31, 31, this.searchShown)) * 31, 31, this.filtersDialogShown)) * 31)) * 31)) * 31)) * 31);
        }

        public final boolean isVoiceChangerEnabled() {
            return this.isVoiceChangerEnabled;
        }

        public String toString() {
            VoicePickerMode voicePickerMode = this.mode;
            ReadMetaState readMetaState = this.readMeta;
            String str = this.fallbackVoiceId;
            String str2 = this.selectedVoiceId;
            String str3 = this.playingPreviewVoiceId;
            boolean z6 = this.searchShown;
            FiltersState filtersState = this.filters;
            boolean z10 = this.filtersDialogShown;
            Set<String> set = this.favoriteChangeInProgressVoiceIds;
            RemoveFavoriteConfirmationDialogState removeFavoriteConfirmationDialogState = this.favoritesRemoveConfirmationState;
            DeleteVoiceConfirmationDialogState deleteVoiceConfirmationDialogState = this.deleteVoiceConfirmationState;
            Set<String> set2 = this.deleteVoiceInProgressIds;
            boolean z11 = this.isVoiceChangerEnabled;
            StringBuilder sb = new StringBuilder("State(mode=");
            sb.append(voicePickerMode);
            sb.append(", readMeta=");
            sb.append(readMetaState);
            sb.append(", fallbackVoiceId=");
            defpackage.f.x(sb, str, ", selectedVoiceId=", str2, ", playingPreviewVoiceId=");
            defpackage.f.y(sb, str3, ", searchShown=", z6, ", filters=");
            sb.append(filtersState);
            sb.append(", filtersDialogShown=");
            sb.append(z10);
            sb.append(", favoriteChangeInProgressVoiceIds=");
            sb.append(set);
            sb.append(", favoritesRemoveConfirmationState=");
            sb.append(removeFavoriteConfirmationDialogState);
            sb.append(", deleteVoiceConfirmationState=");
            sb.append(deleteVoiceConfirmationDialogState);
            sb.append(", deleteVoiceInProgressIds=");
            sb.append(set2);
            sb.append(", isVoiceChangerEnabled=");
            return n.j(Separators.RPAREN, sb, z11);
        }

        public State(VoicePickerMode voicePickerMode, ReadMetaState readMetaState, String str, String str2, String str3, boolean z6, FiltersState filtersState, boolean z10, Set<String> set, RemoveFavoriteConfirmationDialogState removeFavoriteConfirmationDialogState, DeleteVoiceConfirmationDialogState deleteVoiceConfirmationDialogState, Set<String> set2, boolean z11) {
            readMetaState.getClass();
            filtersState.getClass();
            set.getClass();
            removeFavoriteConfirmationDialogState.getClass();
            deleteVoiceConfirmationDialogState.getClass();
            set2.getClass();
            this.mode = voicePickerMode;
            this.readMeta = readMetaState;
            this.fallbackVoiceId = str;
            this.selectedVoiceId = str2;
            this.playingPreviewVoiceId = str3;
            this.searchShown = z6;
            this.filters = filtersState;
            this.filtersDialogShown = z10;
            this.favoriteChangeInProgressVoiceIds = set;
            this.favoritesRemoveConfirmationState = removeFavoriteConfirmationDialogState;
            this.deleteVoiceConfirmationState = deleteVoiceConfirmationDialogState;
            this.deleteVoiceInProgressIds = set2;
            this.isVoiceChangerEnabled = z11;
        }

        public State() {
            this(null, null, null, null, null, false, null, false, null, null, null, null, false, 8191, null);
        }
    }
}
