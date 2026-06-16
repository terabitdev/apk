package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.list;

import android.gov.nist.core.Separators;
import io.elevenlabs.domain.model.SyncStatus;
import io.elevenlabs.domain.model.Voice;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import tn.t;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003À\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/list/VoicesListContract;", "", "State", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public interface VoicesListContract {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u001c"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/list/VoicesListContract$State;", "", "syncStatus", "Lio/elevenlabs/domain/model/SyncStatus;", "voices", "", "Lio/elevenlabs/domain/model/Voice;", "<init>", "(Lio/elevenlabs/domain/model/SyncStatus;Ljava/util/List;)V", "getSyncStatus", "()Lio/elevenlabs/domain/model/SyncStatus;", "getVoices", "()Ljava/util/List;", "showLoading", "", "getShowLoading", "()Z", "showError", "getShowError", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class State {
        public static final int $stable = 8;
        private final boolean showError;
        private final boolean showLoading;
        private final SyncStatus syncStatus;
        private final List<Voice> voices;

        public State(SyncStatus syncStatus, List<Voice> list) {
            boolean z6;
            syncStatus.getClass();
            list.getClass();
            this.syncStatus = syncStatus;
            this.voices = list;
            boolean z10 = false;
            if (syncStatus == SyncStatus.SYNCING && list.isEmpty()) {
                z6 = true;
            } else {
                z6 = false;
            }
            this.showLoading = z6;
            if (syncStatus == SyncStatus.ERROR && list.isEmpty()) {
                z10 = true;
            }
            this.showError = z10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ State copy$default(State state, SyncStatus syncStatus, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                syncStatus = state.syncStatus;
            }
            if ((i10 & 2) != 0) {
                list = state.voices;
            }
            return state.copy(syncStatus, list);
        }

        /* renamed from: component1, reason: from getter */
        public final SyncStatus getSyncStatus() {
            return this.syncStatus;
        }

        public final List<Voice> component2() {
            return this.voices;
        }

        public final State copy(SyncStatus syncStatus, List<Voice> voices) {
            syncStatus.getClass();
            voices.getClass();
            return new State(syncStatus, voices);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            if (this.syncStatus == state.syncStatus && m.c(this.voices, state.voices)) {
                return true;
            }
            return false;
        }

        public final boolean getShowError() {
            return this.showError;
        }

        public final boolean getShowLoading() {
            return this.showLoading;
        }

        public final SyncStatus getSyncStatus() {
            return this.syncStatus;
        }

        public final List<Voice> getVoices() {
            return this.voices;
        }

        public int hashCode() {
            return this.voices.hashCode() + (this.syncStatus.hashCode() * 31);
        }

        public String toString() {
            return "State(syncStatus=" + this.syncStatus + ", voices=" + this.voices + Separators.RPAREN;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public State() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ State(SyncStatus syncStatus, List list, int i10, f fVar) {
            this((i10 & 1) != 0 ? SyncStatus.SYNCING : syncStatus, (i10 & 2) != 0 ? t.f33547a : list);
        }
    }
}
