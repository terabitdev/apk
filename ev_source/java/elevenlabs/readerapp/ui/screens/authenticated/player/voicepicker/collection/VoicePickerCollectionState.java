package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection;

import android.gov.nist.core.Separators;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.domain.model.VoiceCollection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/collection/VoicePickerCollectionState;", "", "Data", "Loading", "Error", "NotFound", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/collection/VoicePickerCollectionState$Data;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/collection/VoicePickerCollectionState$Error;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/collection/VoicePickerCollectionState$Loading;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/collection/VoicePickerCollectionState$NotFound;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public interface VoicePickerCollectionState {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/collection/VoicePickerCollectionState$Data;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/collection/VoicePickerCollectionState;", "collection", "Lio/elevenlabs/domain/model/VoiceCollection;", "voices", "", "Lio/elevenlabs/domain/model/Voice;", "<init>", "(Lio/elevenlabs/domain/model/VoiceCollection;Ljava/util/List;)V", "getCollection", "()Lio/elevenlabs/domain/model/VoiceCollection;", "getVoices", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class Data implements VoicePickerCollectionState {
        public static final int $stable = 8;
        private final VoiceCollection collection;
        private final List<Voice> voices;

        public Data(VoiceCollection voiceCollection, List<Voice> list) {
            voiceCollection.getClass();
            list.getClass();
            this.collection = voiceCollection;
            this.voices = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Data copy$default(Data data, VoiceCollection voiceCollection, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                voiceCollection = data.collection;
            }
            if ((i10 & 2) != 0) {
                list = data.voices;
            }
            return data.copy(voiceCollection, list);
        }

        /* renamed from: component1, reason: from getter */
        public final VoiceCollection getCollection() {
            return this.collection;
        }

        public final List<Voice> component2() {
            return this.voices;
        }

        public final Data copy(VoiceCollection collection, List<Voice> voices) {
            collection.getClass();
            voices.getClass();
            return new Data(collection, voices);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            if (m.c(this.collection, data.collection) && m.c(this.voices, data.voices)) {
                return true;
            }
            return false;
        }

        public final VoiceCollection getCollection() {
            return this.collection;
        }

        public final List<Voice> getVoices() {
            return this.voices;
        }

        public int hashCode() {
            return this.voices.hashCode() + (this.collection.hashCode() * 31);
        }

        public String toString() {
            return "Data(collection=" + this.collection + ", voices=" + this.voices + Separators.RPAREN;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/collection/VoicePickerCollectionState$Error;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/collection/VoicePickerCollectionState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class Error implements VoicePickerCollectionState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        private Error() {
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof Error)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 884363571;
        }

        public String toString() {
            return "Error";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/collection/VoicePickerCollectionState$Loading;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/collection/VoicePickerCollectionState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class Loading implements VoicePickerCollectionState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof Loading)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 1285505447;
        }

        public String toString() {
            return "Loading";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/collection/VoicePickerCollectionState$NotFound;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/collection/VoicePickerCollectionState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class NotFound implements VoicePickerCollectionState {
        public static final int $stable = 0;
        public static final NotFound INSTANCE = new NotFound();

        private NotFound() {
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof NotFound)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 903050596;
        }

        public String toString() {
            return "NotFound";
        }
    }
}
