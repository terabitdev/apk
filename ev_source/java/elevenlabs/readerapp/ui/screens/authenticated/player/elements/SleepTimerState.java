package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import android.gov.nist.core.Separators;
import io.elevenlabs.domain.model.ReadMeta;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/SleepTimerState;", "", "readId", "", "readMeta", "Lio/elevenlabs/domain/model/ReadMeta;", "selected", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/SleepTimerOption;", "options", "", "<init>", "(Ljava/lang/String;Lio/elevenlabs/domain/model/ReadMeta;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/SleepTimerOption;Ljava/util/List;)V", "getReadId", "()Ljava/lang/String;", "getReadMeta", "()Lio/elevenlabs/domain/model/ReadMeta;", "getSelected", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/SleepTimerOption;", "getOptions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class SleepTimerState {
    public static final int $stable = 8;
    private final List<SleepTimerOption> options;
    private final String readId;
    private final ReadMeta readMeta;
    private final SleepTimerOption selected;

    public /* synthetic */ SleepTimerState(String str, ReadMeta readMeta, SleepTimerOption sleepTimerOption, List list, int i10, kotlin.jvm.internal.f fVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : readMeta, (i10 & 4) != 0 ? null : sleepTimerOption, (i10 & 8) != 0 ? SleepTimerSheetKt.defaultOptions : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SleepTimerState copy$default(SleepTimerState sleepTimerState, String str, ReadMeta readMeta, SleepTimerOption sleepTimerOption, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sleepTimerState.readId;
        }
        if ((i10 & 2) != 0) {
            readMeta = sleepTimerState.readMeta;
        }
        if ((i10 & 4) != 0) {
            sleepTimerOption = sleepTimerState.selected;
        }
        if ((i10 & 8) != 0) {
            list = sleepTimerState.options;
        }
        return sleepTimerState.copy(str, readMeta, sleepTimerOption, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getReadId() {
        return this.readId;
    }

    /* renamed from: component2, reason: from getter */
    public final ReadMeta getReadMeta() {
        return this.readMeta;
    }

    /* renamed from: component3, reason: from getter */
    public final SleepTimerOption getSelected() {
        return this.selected;
    }

    public final List<SleepTimerOption> component4() {
        return this.options;
    }

    public final SleepTimerState copy(String readId, ReadMeta readMeta, SleepTimerOption selected, List<? extends SleepTimerOption> options) {
        options.getClass();
        return new SleepTimerState(readId, readMeta, selected, options);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepTimerState)) {
            return false;
        }
        SleepTimerState sleepTimerState = (SleepTimerState) other;
        if (kotlin.jvm.internal.m.c(this.readId, sleepTimerState.readId) && kotlin.jvm.internal.m.c(this.readMeta, sleepTimerState.readMeta) && kotlin.jvm.internal.m.c(this.selected, sleepTimerState.selected) && kotlin.jvm.internal.m.c(this.options, sleepTimerState.options)) {
            return true;
        }
        return false;
    }

    public final List<SleepTimerOption> getOptions() {
        return this.options;
    }

    public final String getReadId() {
        return this.readId;
    }

    public final ReadMeta getReadMeta() {
        return this.readMeta;
    }

    public final SleepTimerOption getSelected() {
        return this.selected;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.readId;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = hashCode * 31;
        ReadMeta readMeta = this.readMeta;
        if (readMeta == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = readMeta.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        SleepTimerOption sleepTimerOption = this.selected;
        if (sleepTimerOption != null) {
            i10 = sleepTimerOption.hashCode();
        }
        return this.options.hashCode() + ((i12 + i10) * 31);
    }

    public String toString() {
        return "SleepTimerState(readId=" + this.readId + ", readMeta=" + this.readMeta + ", selected=" + this.selected + ", options=" + this.options + Separators.RPAREN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SleepTimerState(String str, ReadMeta readMeta, SleepTimerOption sleepTimerOption, List<? extends SleepTimerOption> list) {
        list.getClass();
        this.readId = str;
        this.readMeta = readMeta;
        this.selected = sleepTimerOption;
        this.options = list;
    }

    public SleepTimerState() {
        this(null, null, null, null, 15, null);
    }
}
