package io.elevenlabs.readerapp.ui.screens.authenticated.explore;

import android.gov.nist.core.Separators;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import io.elevenlabs.domain.model.MoneyPrice;
import io.elevenlabs.domain.model.PageFilter;
import io.elevenlabs.domain.model.ReadsExplorePage;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003J\u001b\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\fHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\"J¤\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010/J\u0014\u00100\u001a\u00020\u00032\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00102\u001a\u000203HÖ\u0081\u0004J\n\u00104\u001a\u00020\nHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0015R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u001f\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010#\u001a\u0004\b\u0012\u0010\"¨\u00065"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/explore/ExploreState;", "", "isInitialLoading", "", "pageFilters", "", "Lio/elevenlabs/domain/model/PageFilter;", "generalContent", "Lio/elevenlabs/domain/model/ReadsExplorePage;", "generalContentError", "", "activeFilters", "", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "currencyCode", "localizedPrices", "Lio/elevenlabs/domain/model/MoneyPrice;", "playingPreviewReadId", "isFreeUser", "<init>", "(ZLjava/util/List;Lio/elevenlabs/domain/model/ReadsExplorePage;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Boolean;)V", "()Z", "getPageFilters", "()Ljava/util/List;", "getGeneralContent", "()Lio/elevenlabs/domain/model/ReadsExplorePage;", "getGeneralContentError", "()Ljava/lang/String;", "getActiveFilters", "()Ljava/util/Map;", "getLanguageCode", "getCurrencyCode", "getLocalizedPrices", "getPlayingPreviewReadId", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(ZLjava/util/List;Lio/elevenlabs/domain/model/ReadsExplorePage;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Boolean;)Lio/elevenlabs/readerapp/ui/screens/authenticated/explore/ExploreState;", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class ExploreState {
    public static final int $stable = 8;
    private final Map<String, List<String>> activeFilters;
    private final String currencyCode;
    private final ReadsExplorePage generalContent;
    private final String generalContentError;
    private final Boolean isFreeUser;
    private final boolean isInitialLoading;
    private final String languageCode;
    private final Map<String, MoneyPrice> localizedPrices;
    private final List<PageFilter> pageFilters;
    private final String playingPreviewReadId;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ExploreState(boolean r2, java.util.List r3, io.elevenlabs.domain.model.ReadsExplorePage r4, java.lang.String r5, java.util.Map r6, java.lang.String r7, java.lang.String r8, java.util.Map r9, java.lang.String r10, java.lang.Boolean r11, int r12, kotlin.jvm.internal.f r13) {
        /*
            r1 = this;
            r13 = r12 & 1
            if (r13 == 0) goto L5
            r2 = 1
        L5:
            r13 = r12 & 2
            if (r13 == 0) goto Lb
            tn.t r3 = tn.t.f33547a
        Lb:
            r13 = r12 & 4
            r0 = 0
            if (r13 == 0) goto L11
            r4 = r0
        L11:
            r13 = r12 & 8
            if (r13 == 0) goto L16
            r5 = r0
        L16:
            r13 = r12 & 16
            if (r13 == 0) goto L1c
            tn.u r6 = tn.u.f33548a
        L1c:
            r13 = r12 & 32
            if (r13 == 0) goto L21
            r7 = r0
        L21:
            r13 = r12 & 64
            if (r13 == 0) goto L26
            r8 = r0
        L26:
            r13 = r12 & 128(0x80, float:1.8E-43)
            if (r13 == 0) goto L2b
            r9 = r0
        L2b:
            r13 = r12 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L30
            r10 = r0
        L30:
            r12 = r12 & 512(0x200, float:7.17E-43)
            if (r12 == 0) goto L40
            r13 = r0
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L4b
        L40:
            r13 = r11
            r12 = r10
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L4b:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreState.<init>(boolean, java.util.List, io.elevenlabs.domain.model.ReadsExplorePage, java.lang.String, java.util.Map, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.lang.Boolean, int, kotlin.jvm.internal.f):void");
    }

    public static /* synthetic */ ExploreState copy$default(ExploreState exploreState, boolean z6, List list, ReadsExplorePage readsExplorePage, String str, Map map, String str2, String str3, Map map2, String str4, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = exploreState.isInitialLoading;
        }
        if ((i10 & 2) != 0) {
            list = exploreState.pageFilters;
        }
        if ((i10 & 4) != 0) {
            readsExplorePage = exploreState.generalContent;
        }
        if ((i10 & 8) != 0) {
            str = exploreState.generalContentError;
        }
        if ((i10 & 16) != 0) {
            map = exploreState.activeFilters;
        }
        if ((i10 & 32) != 0) {
            str2 = exploreState.languageCode;
        }
        if ((i10 & 64) != 0) {
            str3 = exploreState.currencyCode;
        }
        if ((i10 & 128) != 0) {
            map2 = exploreState.localizedPrices;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            str4 = exploreState.playingPreviewReadId;
        }
        if ((i10 & 512) != 0) {
            bool = exploreState.isFreeUser;
        }
        String str5 = str4;
        Boolean bool2 = bool;
        String str6 = str3;
        Map map3 = map2;
        Map map4 = map;
        String str7 = str2;
        return exploreState.copy(z6, list, readsExplorePage, str, map4, str7, str6, map3, str5, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsInitialLoading() {
        return this.isInitialLoading;
    }

    /* renamed from: component10, reason: from getter */
    public final Boolean getIsFreeUser() {
        return this.isFreeUser;
    }

    public final List<PageFilter> component2() {
        return this.pageFilters;
    }

    /* renamed from: component3, reason: from getter */
    public final ReadsExplorePage getGeneralContent() {
        return this.generalContent;
    }

    /* renamed from: component4, reason: from getter */
    public final String getGeneralContentError() {
        return this.generalContentError;
    }

    public final Map<String, List<String>> component5() {
        return this.activeFilters;
    }

    /* renamed from: component6, reason: from getter */
    public final String getLanguageCode() {
        return this.languageCode;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final Map<String, MoneyPrice> component8() {
        return this.localizedPrices;
    }

    /* renamed from: component9, reason: from getter */
    public final String getPlayingPreviewReadId() {
        return this.playingPreviewReadId;
    }

    public final ExploreState copy(boolean isInitialLoading, List<? extends PageFilter> pageFilters, ReadsExplorePage generalContent, String generalContentError, Map<String, ? extends List<String>> activeFilters, String r17, String currencyCode, Map<String, MoneyPrice> localizedPrices, String playingPreviewReadId, Boolean isFreeUser) {
        pageFilters.getClass();
        activeFilters.getClass();
        return new ExploreState(isInitialLoading, pageFilters, generalContent, generalContentError, activeFilters, r17, currencyCode, localizedPrices, playingPreviewReadId, isFreeUser);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExploreState)) {
            return false;
        }
        ExploreState exploreState = (ExploreState) other;
        if (this.isInitialLoading == exploreState.isInitialLoading && kotlin.jvm.internal.m.c(this.pageFilters, exploreState.pageFilters) && kotlin.jvm.internal.m.c(this.generalContent, exploreState.generalContent) && kotlin.jvm.internal.m.c(this.generalContentError, exploreState.generalContentError) && kotlin.jvm.internal.m.c(this.activeFilters, exploreState.activeFilters) && kotlin.jvm.internal.m.c(this.languageCode, exploreState.languageCode) && kotlin.jvm.internal.m.c(this.currencyCode, exploreState.currencyCode) && kotlin.jvm.internal.m.c(this.localizedPrices, exploreState.localizedPrices) && kotlin.jvm.internal.m.c(this.playingPreviewReadId, exploreState.playingPreviewReadId) && kotlin.jvm.internal.m.c(this.isFreeUser, exploreState.isFreeUser)) {
            return true;
        }
        return false;
    }

    public final Map<String, List<String>> getActiveFilters() {
        return this.activeFilters;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final ReadsExplorePage getGeneralContent() {
        return this.generalContent;
    }

    public final String getGeneralContentError() {
        return this.generalContentError;
    }

    public final String getLanguageCode() {
        return this.languageCode;
    }

    public final Map<String, MoneyPrice> getLocalizedPrices() {
        return this.localizedPrices;
    }

    public final List<PageFilter> getPageFilters() {
        return this.pageFilters;
    }

    public final String getPlayingPreviewReadId() {
        return this.playingPreviewReadId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int d10 = p.n.d(Boolean.hashCode(this.isInitialLoading) * 31, 31, this.pageFilters);
        ReadsExplorePage readsExplorePage = this.generalContent;
        int i10 = 0;
        if (readsExplorePage == null) {
            hashCode = 0;
        } else {
            hashCode = readsExplorePage.hashCode();
        }
        int i11 = (d10 + hashCode) * 31;
        String str = this.generalContentError;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int a10 = defpackage.f.a(this.activeFilters, (i11 + hashCode2) * 31, 31);
        String str2 = this.languageCode;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i12 = (a10 + hashCode3) * 31;
        String str3 = this.currencyCode;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        Map<String, MoneyPrice> map = this.localizedPrices;
        if (map == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = map.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        String str4 = this.playingPreviewReadId;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i15 = (i14 + hashCode6) * 31;
        Boolean bool = this.isFreeUser;
        if (bool != null) {
            i10 = bool.hashCode();
        }
        return i15 + i10;
    }

    public final Boolean isFreeUser() {
        return this.isFreeUser;
    }

    public final boolean isInitialLoading() {
        return this.isInitialLoading;
    }

    public String toString() {
        return "ExploreState(isInitialLoading=" + this.isInitialLoading + ", pageFilters=" + this.pageFilters + ", generalContent=" + this.generalContent + ", generalContentError=" + this.generalContentError + ", activeFilters=" + this.activeFilters + ", languageCode=" + this.languageCode + ", currencyCode=" + this.currencyCode + ", localizedPrices=" + this.localizedPrices + ", playingPreviewReadId=" + this.playingPreviewReadId + ", isFreeUser=" + this.isFreeUser + Separators.RPAREN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExploreState(boolean z6, List<? extends PageFilter> list, ReadsExplorePage readsExplorePage, String str, Map<String, ? extends List<String>> map, String str2, String str3, Map<String, MoneyPrice> map2, String str4, Boolean bool) {
        list.getClass();
        map.getClass();
        this.isInitialLoading = z6;
        this.pageFilters = list;
        this.generalContent = readsExplorePage;
        this.generalContentError = str;
        this.activeFilters = map;
        this.languageCode = str2;
        this.currencyCode = str3;
        this.localizedPrices = map2;
        this.playingPreviewReadId = str4;
        this.isFreeUser = bool;
    }

    public ExploreState() {
        this(false, null, null, null, null, null, null, null, null, null, 1023, null);
    }
}
