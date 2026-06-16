package io.elevenlabs.readerapp.ui.screens.authenticated.account.explore;

import android.gov.nist.core.Separators;
import com.google.firebase.messaging.Constants;
import io.elevenlabs.domain.model.KeyLabel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import p.n;
import tn.t;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001c"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/account/explore/ExploreLanguageState;", "", "isLoading", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "availableLanguages", "", "Lio/elevenlabs/domain/model/KeyLabel;", "selectedLanguageCode", "<init>", "(ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "()Z", "getError", "()Ljava/lang/String;", "getAvailableLanguages", "()Ljava/util/List;", "getSelectedLanguageCode", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class ExploreLanguageState {
    public static final int $stable = 8;
    private final List<KeyLabel> availableLanguages;
    private final String error;
    private final boolean isLoading;
    private final String selectedLanguageCode;

    public /* synthetic */ ExploreLanguageState(boolean z6, String str, List list, String str2, int i10, kotlin.jvm.internal.f fVar) {
        this((i10 & 1) != 0 ? false : z6, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? t.f33547a : list, (i10 & 8) != 0 ? null : str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExploreLanguageState copy$default(ExploreLanguageState exploreLanguageState, boolean z6, String str, List list, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = exploreLanguageState.isLoading;
        }
        if ((i10 & 2) != 0) {
            str = exploreLanguageState.error;
        }
        if ((i10 & 4) != 0) {
            list = exploreLanguageState.availableLanguages;
        }
        if ((i10 & 8) != 0) {
            str2 = exploreLanguageState.selectedLanguageCode;
        }
        return exploreLanguageState.copy(z6, str, list, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final List<KeyLabel> component3() {
        return this.availableLanguages;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSelectedLanguageCode() {
        return this.selectedLanguageCode;
    }

    public final ExploreLanguageState copy(boolean isLoading, String error, List<KeyLabel> availableLanguages, String selectedLanguageCode) {
        availableLanguages.getClass();
        return new ExploreLanguageState(isLoading, error, availableLanguages, selectedLanguageCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExploreLanguageState)) {
            return false;
        }
        ExploreLanguageState exploreLanguageState = (ExploreLanguageState) other;
        if (this.isLoading == exploreLanguageState.isLoading && m.c(this.error, exploreLanguageState.error) && m.c(this.availableLanguages, exploreLanguageState.availableLanguages) && m.c(this.selectedLanguageCode, exploreLanguageState.selectedLanguageCode)) {
            return true;
        }
        return false;
    }

    public final List<KeyLabel> getAvailableLanguages() {
        return this.availableLanguages;
    }

    public final String getError() {
        return this.error;
    }

    public final String getSelectedLanguageCode() {
        return this.selectedLanguageCode;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = Boolean.hashCode(this.isLoading) * 31;
        String str = this.error;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int d10 = n.d((hashCode2 + hashCode) * 31, 31, this.availableLanguages);
        String str2 = this.selectedLanguageCode;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return d10 + i10;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public String toString() {
        return "ExploreLanguageState(isLoading=" + this.isLoading + ", error=" + this.error + ", availableLanguages=" + this.availableLanguages + ", selectedLanguageCode=" + this.selectedLanguageCode + Separators.RPAREN;
    }

    public ExploreLanguageState(boolean z6, String str, List<KeyLabel> list, String str2) {
        list.getClass();
        this.isLoading = z6;
        this.error = str;
        this.availableLanguages = list;
        this.selectedLanguageCode = str2;
    }

    public ExploreLanguageState() {
        this(false, null, null, null, 15, null);
    }
}
