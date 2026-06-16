package io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations;

import android.gov.nist.core.Separators;
import io.elevenlabs.domain.model.PronunciationPreviewState;
import io.elevenlabs.readerapp.ui.models.UiAction;
import io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationScreenMode;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016J\u0010\u0010\u001f\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 Jr\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u0016J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b.\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b/\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b\t\u0010\u001aR\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u0010\u001aR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u0010\u001dR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b4\u0010\u0016R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00105\u001a\u0004\b6\u0010 ¨\u00067"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/pronunciations/PronunciationState;", "", "Lio/elevenlabs/readerapp/ui/screens/authenticated/pronunciations/PronunciationScreenMode;", "mode", "", "originalText", "spokenText", "voiceId", "", "isLoading", "showOriginalTextTooLongWarning", "Lio/elevenlabs/readerapp/ui/models/UiAction;", "Lsn/z;", "navigateBack", "editingPronunciationId", "Lio/elevenlabs/domain/model/PronunciationPreviewState;", "previewState", "<init>", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/pronunciations/PronunciationScreenMode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLio/elevenlabs/readerapp/ui/models/UiAction;Ljava/lang/String;Lio/elevenlabs/domain/model/PronunciationPreviewState;)V", "component1", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/pronunciations/PronunciationScreenMode;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Z", "component6", "component7", "()Lio/elevenlabs/readerapp/ui/models/UiAction;", "component8", "component9", "()Lio/elevenlabs/domain/model/PronunciationPreviewState;", "copy", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/pronunciations/PronunciationScreenMode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLio/elevenlabs/readerapp/ui/models/UiAction;Ljava/lang/String;Lio/elevenlabs/domain/model/PronunciationPreviewState;)Lio/elevenlabs/readerapp/ui/screens/authenticated/pronunciations/PronunciationState;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lio/elevenlabs/readerapp/ui/screens/authenticated/pronunciations/PronunciationScreenMode;", "getMode", "Ljava/lang/String;", "getOriginalText", "getSpokenText", "getVoiceId", "Z", "getShowOriginalTextTooLongWarning", "Lio/elevenlabs/readerapp/ui/models/UiAction;", "getNavigateBack", "getEditingPronunciationId", "Lio/elevenlabs/domain/model/PronunciationPreviewState;", "getPreviewState", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class PronunciationState {
    public static final int $stable = 0;
    private final String editingPronunciationId;
    private final boolean isLoading;
    private final PronunciationScreenMode mode;
    private final UiAction<z> navigateBack;
    private final String originalText;
    private final PronunciationPreviewState previewState;
    private final boolean showOriginalTextTooLongWarning;
    private final String spokenText;
    private final String voiceId;

    public /* synthetic */ PronunciationState(PronunciationScreenMode pronunciationScreenMode, String str, String str2, String str3, boolean z6, boolean z10, UiAction uiAction, String str4, PronunciationPreviewState pronunciationPreviewState, int i10, kotlin.jvm.internal.f fVar) {
        this((i10 & 1) != 0 ? new PronunciationScreenMode.Add("", "") : pronunciationScreenMode, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? "" : str2, (i10 & 8) != 0 ? "" : str3, (i10 & 16) != 0 ? false : z6, (i10 & 32) != 0 ? false : z10, (i10 & 64) != 0 ? UiAction.Reset.INSTANCE : uiAction, (i10 & 128) != 0 ? null : str4, (i10 & RpcError.MAX_MESSAGE_BYTES) != 0 ? PronunciationPreviewState.Stopped : pronunciationPreviewState);
    }

    public static /* synthetic */ PronunciationState copy$default(PronunciationState pronunciationState, PronunciationScreenMode pronunciationScreenMode, String str, String str2, String str3, boolean z6, boolean z10, UiAction uiAction, String str4, PronunciationPreviewState pronunciationPreviewState, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            pronunciationScreenMode = pronunciationState.mode;
        }
        if ((i10 & 2) != 0) {
            str = pronunciationState.originalText;
        }
        if ((i10 & 4) != 0) {
            str2 = pronunciationState.spokenText;
        }
        if ((i10 & 8) != 0) {
            str3 = pronunciationState.voiceId;
        }
        if ((i10 & 16) != 0) {
            z6 = pronunciationState.isLoading;
        }
        if ((i10 & 32) != 0) {
            z10 = pronunciationState.showOriginalTextTooLongWarning;
        }
        if ((i10 & 64) != 0) {
            uiAction = pronunciationState.navigateBack;
        }
        if ((i10 & 128) != 0) {
            str4 = pronunciationState.editingPronunciationId;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            pronunciationPreviewState = pronunciationState.previewState;
        }
        String str5 = str4;
        PronunciationPreviewState pronunciationPreviewState2 = pronunciationPreviewState;
        boolean z11 = z10;
        UiAction uiAction2 = uiAction;
        boolean z12 = z6;
        String str6 = str2;
        return pronunciationState.copy(pronunciationScreenMode, str, str6, str3, z12, z11, uiAction2, str5, pronunciationPreviewState2);
    }

    /* renamed from: component1, reason: from getter */
    public final PronunciationScreenMode getMode() {
        return this.mode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOriginalText() {
        return this.originalText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSpokenText() {
        return this.spokenText;
    }

    /* renamed from: component4, reason: from getter */
    public final String getVoiceId() {
        return this.voiceId;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShowOriginalTextTooLongWarning() {
        return this.showOriginalTextTooLongWarning;
    }

    public final UiAction<z> component7() {
        return this.navigateBack;
    }

    /* renamed from: component8, reason: from getter */
    public final String getEditingPronunciationId() {
        return this.editingPronunciationId;
    }

    /* renamed from: component9, reason: from getter */
    public final PronunciationPreviewState getPreviewState() {
        return this.previewState;
    }

    public final PronunciationState copy(PronunciationScreenMode mode, String originalText, String spokenText, String voiceId, boolean isLoading, boolean showOriginalTextTooLongWarning, UiAction<z> navigateBack, String editingPronunciationId, PronunciationPreviewState previewState) {
        mode.getClass();
        originalText.getClass();
        spokenText.getClass();
        voiceId.getClass();
        navigateBack.getClass();
        previewState.getClass();
        return new PronunciationState(mode, originalText, spokenText, voiceId, isLoading, showOriginalTextTooLongWarning, navigateBack, editingPronunciationId, previewState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PronunciationState)) {
            return false;
        }
        PronunciationState pronunciationState = (PronunciationState) other;
        if (kotlin.jvm.internal.m.c(this.mode, pronunciationState.mode) && kotlin.jvm.internal.m.c(this.originalText, pronunciationState.originalText) && kotlin.jvm.internal.m.c(this.spokenText, pronunciationState.spokenText) && kotlin.jvm.internal.m.c(this.voiceId, pronunciationState.voiceId) && this.isLoading == pronunciationState.isLoading && this.showOriginalTextTooLongWarning == pronunciationState.showOriginalTextTooLongWarning && kotlin.jvm.internal.m.c(this.navigateBack, pronunciationState.navigateBack) && kotlin.jvm.internal.m.c(this.editingPronunciationId, pronunciationState.editingPronunciationId) && this.previewState == pronunciationState.previewState) {
            return true;
        }
        return false;
    }

    public final String getEditingPronunciationId() {
        return this.editingPronunciationId;
    }

    public final PronunciationScreenMode getMode() {
        return this.mode;
    }

    public final UiAction<z> getNavigateBack() {
        return this.navigateBack;
    }

    public final String getOriginalText() {
        return this.originalText;
    }

    public final PronunciationPreviewState getPreviewState() {
        return this.previewState;
    }

    public final boolean getShowOriginalTextTooLongWarning() {
        return this.showOriginalTextTooLongWarning;
    }

    public final String getSpokenText() {
        return this.spokenText;
    }

    public final String getVoiceId() {
        return this.voiceId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.navigateBack.hashCode() + com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f(j0.c.c(j0.c.c(j0.c.c(this.mode.hashCode() * 31, 31, this.originalText), 31, this.spokenText), 31, this.voiceId), 31, this.isLoading), 31, this.showOriginalTextTooLongWarning)) * 31;
        String str = this.editingPronunciationId;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.previewState.hashCode() + ((hashCode2 + hashCode) * 31);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public String toString() {
        PronunciationScreenMode pronunciationScreenMode = this.mode;
        String str = this.originalText;
        String str2 = this.spokenText;
        String str3 = this.voiceId;
        boolean z6 = this.isLoading;
        boolean z10 = this.showOriginalTextTooLongWarning;
        UiAction<z> uiAction = this.navigateBack;
        String str4 = this.editingPronunciationId;
        PronunciationPreviewState pronunciationPreviewState = this.previewState;
        StringBuilder sb = new StringBuilder("PronunciationState(mode=");
        sb.append(pronunciationScreenMode);
        sb.append(", originalText=");
        sb.append(str);
        sb.append(", spokenText=");
        defpackage.f.x(sb, str2, ", voiceId=", str3, ", isLoading=");
        ib.i.t(sb, z6, ", showOriginalTextTooLongWarning=", z10, ", navigateBack=");
        sb.append(uiAction);
        sb.append(", editingPronunciationId=");
        sb.append(str4);
        sb.append(", previewState=");
        sb.append(pronunciationPreviewState);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    public PronunciationState(PronunciationScreenMode pronunciationScreenMode, String str, String str2, String str3, boolean z6, boolean z10, UiAction<z> uiAction, String str4, PronunciationPreviewState pronunciationPreviewState) {
        pronunciationScreenMode.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        uiAction.getClass();
        pronunciationPreviewState.getClass();
        this.mode = pronunciationScreenMode;
        this.originalText = str;
        this.spokenText = str2;
        this.voiceId = str3;
        this.isLoading = z6;
        this.showOriginalTextTooLongWarning = z10;
        this.navigateBack = uiAction;
        this.editingPronunciationId = str4;
        this.previewState = pronunciationPreviewState;
    }

    public PronunciationState() {
        this(null, null, null, null, false, false, null, null, null, 511, null);
    }
}
