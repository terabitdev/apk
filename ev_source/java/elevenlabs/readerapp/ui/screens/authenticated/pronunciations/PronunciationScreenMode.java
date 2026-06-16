package io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/pronunciations/PronunciationScreenMode;", "", "Add", "Edit", "Lio/elevenlabs/readerapp/ui/screens/authenticated/pronunciations/PronunciationScreenMode$Add;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/pronunciations/PronunciationScreenMode$Edit;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public interface PronunciationScreenMode {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/pronunciations/PronunciationScreenMode$Add;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/pronunciations/PronunciationScreenMode;", "voiceId", "", "originalText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getVoiceId", "()Ljava/lang/String;", "getOriginalText", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class Add implements PronunciationScreenMode {
        public static final int $stable = 0;
        private final String originalText;
        private final String voiceId;

        public Add(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.voiceId = str;
            this.originalText = str2;
        }

        public static /* synthetic */ Add copy$default(Add add, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = add.voiceId;
            }
            if ((i10 & 2) != 0) {
                str2 = add.originalText;
            }
            return add.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getVoiceId() {
            return this.voiceId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getOriginalText() {
            return this.originalText;
        }

        public final Add copy(String voiceId, String originalText) {
            voiceId.getClass();
            originalText.getClass();
            return new Add(voiceId, originalText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Add)) {
                return false;
            }
            Add add = (Add) other;
            if (kotlin.jvm.internal.m.c(this.voiceId, add.voiceId) && kotlin.jvm.internal.m.c(this.originalText, add.originalText)) {
                return true;
            }
            return false;
        }

        public final String getOriginalText() {
            return this.originalText;
        }

        public final String getVoiceId() {
            return this.voiceId;
        }

        public int hashCode() {
            return this.originalText.hashCode() + (this.voiceId.hashCode() * 31);
        }

        public String toString() {
            return z.h.c("Add(voiceId=", this.voiceId, ", originalText=", this.originalText, Separators.RPAREN);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/pronunciations/PronunciationScreenMode$Edit;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/pronunciations/PronunciationScreenMode;", "voiceId", "", "pronunciationId", "originalText", "spokenText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getVoiceId", "()Ljava/lang/String;", "getPronunciationId", "getOriginalText", "getSpokenText", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class Edit implements PronunciationScreenMode {
        public static final int $stable = 0;
        private final String originalText;
        private final String pronunciationId;
        private final String spokenText;
        private final String voiceId;

        public Edit(String str, String str2, String str3, String str4) {
            j0.c.u(str, str2, str3, str4);
            this.voiceId = str;
            this.pronunciationId = str2;
            this.originalText = str3;
            this.spokenText = str4;
        }

        public static /* synthetic */ Edit copy$default(Edit edit, String str, String str2, String str3, String str4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = edit.voiceId;
            }
            if ((i10 & 2) != 0) {
                str2 = edit.pronunciationId;
            }
            if ((i10 & 4) != 0) {
                str3 = edit.originalText;
            }
            if ((i10 & 8) != 0) {
                str4 = edit.spokenText;
            }
            return edit.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getVoiceId() {
            return this.voiceId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPronunciationId() {
            return this.pronunciationId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getOriginalText() {
            return this.originalText;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSpokenText() {
            return this.spokenText;
        }

        public final Edit copy(String voiceId, String pronunciationId, String originalText, String spokenText) {
            voiceId.getClass();
            pronunciationId.getClass();
            originalText.getClass();
            spokenText.getClass();
            return new Edit(voiceId, pronunciationId, originalText, spokenText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Edit)) {
                return false;
            }
            Edit edit = (Edit) other;
            if (kotlin.jvm.internal.m.c(this.voiceId, edit.voiceId) && kotlin.jvm.internal.m.c(this.pronunciationId, edit.pronunciationId) && kotlin.jvm.internal.m.c(this.originalText, edit.originalText) && kotlin.jvm.internal.m.c(this.spokenText, edit.spokenText)) {
                return true;
            }
            return false;
        }

        public final String getOriginalText() {
            return this.originalText;
        }

        public final String getPronunciationId() {
            return this.pronunciationId;
        }

        public final String getSpokenText() {
            return this.spokenText;
        }

        public final String getVoiceId() {
            return this.voiceId;
        }

        public int hashCode() {
            return this.spokenText.hashCode() + j0.c.c(j0.c.c(this.voiceId.hashCode() * 31, 31, this.pronunciationId), 31, this.originalText);
        }

        public String toString() {
            String str = this.voiceId;
            String str2 = this.pronunciationId;
            return defpackage.f.n(defpackage.f.s("Edit(voiceId=", str, ", pronunciationId=", str2, ", originalText="), this.originalText, ", spokenText=", this.spokenText, Separators.RPAREN);
        }
    }
}
