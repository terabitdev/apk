package io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations;

import android.gov.nist.core.Separators;
import io.elevenlabs.domain.model.Pronunciation;
import io.elevenlabs.domain.model.PronunciationPreviewState;
import io.elevenlabs.readerapp.ui.models.UiAction;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import tn.t;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\b0\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\\\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\b0\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b\u0006\u0010\u0013R)\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\b0\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010\u0015R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010\u0017R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010\u0019¨\u0006,"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/pronunciations/PronunciationsListState;", "", "", "Lio/elevenlabs/domain/model/Pronunciation;", "pronunciations", "", "isLoading", "Lio/elevenlabs/readerapp/ui/models/UiAction;", "Lsn/k;", "", "navigateToEdit", "Lio/elevenlabs/domain/model/PronunciationPreviewState;", "previewState", "previewPlayingPronunciationId", "<init>", "(Ljava/util/List;ZLio/elevenlabs/readerapp/ui/models/UiAction;Lio/elevenlabs/domain/model/PronunciationPreviewState;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Z", "component3", "()Lio/elevenlabs/readerapp/ui/models/UiAction;", "component4", "()Lio/elevenlabs/domain/model/PronunciationPreviewState;", "component5", "()Ljava/lang/String;", "copy", "(Ljava/util/List;ZLio/elevenlabs/readerapp/ui/models/UiAction;Lio/elevenlabs/domain/model/PronunciationPreviewState;Ljava/lang/String;)Lio/elevenlabs/readerapp/ui/screens/authenticated/pronunciations/PronunciationsListState;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPronunciations", "Z", "Lio/elevenlabs/readerapp/ui/models/UiAction;", "getNavigateToEdit", "Lio/elevenlabs/domain/model/PronunciationPreviewState;", "getPreviewState", "Ljava/lang/String;", "getPreviewPlayingPronunciationId", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class PronunciationsListState {
    public static final int $stable = 8;
    private final boolean isLoading;
    private final UiAction<sn.k> navigateToEdit;
    private final String previewPlayingPronunciationId;
    private final PronunciationPreviewState previewState;
    private final List<Pronunciation> pronunciations;

    public /* synthetic */ PronunciationsListState(List list, boolean z6, UiAction uiAction, PronunciationPreviewState pronunciationPreviewState, String str, int i10, kotlin.jvm.internal.f fVar) {
        this((i10 & 1) != 0 ? t.f33547a : list, (i10 & 2) != 0 ? true : z6, (i10 & 4) != 0 ? UiAction.Reset.INSTANCE : uiAction, (i10 & 8) != 0 ? PronunciationPreviewState.Stopped : pronunciationPreviewState, (i10 & 16) != 0 ? null : str);
    }

    public static /* synthetic */ PronunciationsListState copy$default(PronunciationsListState pronunciationsListState, List list, boolean z6, UiAction uiAction, PronunciationPreviewState pronunciationPreviewState, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = pronunciationsListState.pronunciations;
        }
        if ((i10 & 2) != 0) {
            z6 = pronunciationsListState.isLoading;
        }
        if ((i10 & 4) != 0) {
            uiAction = pronunciationsListState.navigateToEdit;
        }
        if ((i10 & 8) != 0) {
            pronunciationPreviewState = pronunciationsListState.previewState;
        }
        if ((i10 & 16) != 0) {
            str = pronunciationsListState.previewPlayingPronunciationId;
        }
        String str2 = str;
        UiAction uiAction2 = uiAction;
        return pronunciationsListState.copy(list, z6, uiAction2, pronunciationPreviewState, str2);
    }

    public final List<Pronunciation> component1() {
        return this.pronunciations;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final UiAction<sn.k> component3() {
        return this.navigateToEdit;
    }

    /* renamed from: component4, reason: from getter */
    public final PronunciationPreviewState getPreviewState() {
        return this.previewState;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPreviewPlayingPronunciationId() {
        return this.previewPlayingPronunciationId;
    }

    public final PronunciationsListState copy(List<Pronunciation> pronunciations, boolean isLoading, UiAction<sn.k> navigateToEdit, PronunciationPreviewState previewState, String previewPlayingPronunciationId) {
        pronunciations.getClass();
        navigateToEdit.getClass();
        previewState.getClass();
        return new PronunciationsListState(pronunciations, isLoading, navigateToEdit, previewState, previewPlayingPronunciationId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PronunciationsListState)) {
            return false;
        }
        PronunciationsListState pronunciationsListState = (PronunciationsListState) other;
        if (kotlin.jvm.internal.m.c(this.pronunciations, pronunciationsListState.pronunciations) && this.isLoading == pronunciationsListState.isLoading && kotlin.jvm.internal.m.c(this.navigateToEdit, pronunciationsListState.navigateToEdit) && this.previewState == pronunciationsListState.previewState && kotlin.jvm.internal.m.c(this.previewPlayingPronunciationId, pronunciationsListState.previewPlayingPronunciationId)) {
            return true;
        }
        return false;
    }

    public final UiAction<sn.k> getNavigateToEdit() {
        return this.navigateToEdit;
    }

    public final String getPreviewPlayingPronunciationId() {
        return this.previewPlayingPronunciationId;
    }

    public final PronunciationPreviewState getPreviewState() {
        return this.previewState;
    }

    public final List<Pronunciation> getPronunciations() {
        return this.pronunciations;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.previewState.hashCode() + ((this.navigateToEdit.hashCode() + com.google.android.gms.internal.play_billing.b.f(this.pronunciations.hashCode() * 31, 31, this.isLoading)) * 31)) * 31;
        String str = this.previewPlayingPronunciationId;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public String toString() {
        List<Pronunciation> list = this.pronunciations;
        boolean z6 = this.isLoading;
        UiAction<sn.k> uiAction = this.navigateToEdit;
        PronunciationPreviewState pronunciationPreviewState = this.previewState;
        String str = this.previewPlayingPronunciationId;
        StringBuilder sb = new StringBuilder("PronunciationsListState(pronunciations=");
        sb.append(list);
        sb.append(", isLoading=");
        sb.append(z6);
        sb.append(", navigateToEdit=");
        sb.append(uiAction);
        sb.append(", previewState=");
        sb.append(pronunciationPreviewState);
        sb.append(", previewPlayingPronunciationId=");
        return defpackage.f.l(str, Separators.RPAREN, sb);
    }

    public PronunciationsListState(List<Pronunciation> list, boolean z6, UiAction<sn.k> uiAction, PronunciationPreviewState pronunciationPreviewState, String str) {
        list.getClass();
        uiAction.getClass();
        pronunciationPreviewState.getClass();
        this.pronunciations = list;
        this.isLoading = z6;
        this.navigateToEdit = uiAction;
        this.previewState = pronunciationPreviewState;
        this.previewPlayingPronunciationId = str;
    }

    public PronunciationsListState() {
        this(null, false, null, null, null, 31, null);
    }
}
