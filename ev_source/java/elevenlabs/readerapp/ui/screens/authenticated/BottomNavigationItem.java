package io.elevenlabs.readerapp.ui.screens.authenticated;

import android.gov.nist.core.Separators;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.ui.ShowkasePreviewGroup;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0012\u0013\u0014\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\r\u0082\u0001\u0004\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/BottomNavigationItem;", "", "<init>", "()V", "route", "", "getRoute", "()Ljava/lang/String;", "analyticsLabel", "getAnalyticsLabel", "titleRes", "", "getTitleRes", "()I", "iconRes", "getIconRes", "iconResActive", "getIconResActive", "Home", "Reads", "Explore", "Voices", "Lio/elevenlabs/readerapp/ui/screens/authenticated/BottomNavigationItem$Explore;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/BottomNavigationItem$Home;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/BottomNavigationItem$Reads;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/BottomNavigationItem$Voices;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public abstract class BottomNavigationItem {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u000bHÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r¨\u0006\u001a"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/BottomNavigationItem$Explore;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/BottomNavigationItem;", "route", "", "<init>", "(Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "analyticsLabel", "getAnalyticsLabel", "titleRes", "", "getTitleRes", "()I", "iconRes", "getIconRes", "iconResActive", "getIconResActive", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class Explore extends BottomNavigationItem {
        public static final int $stable = 0;
        private final String analyticsLabel;
        private final int iconRes;
        private final int iconResActive;
        private final String route;
        private final int titleRes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Explore(String str) {
            super(null);
            str.getClass();
            this.route = str;
            this.analyticsLabel = ShowkasePreviewGroup.EXPLORE;
            this.titleRes = R.string.home_explore;
            this.iconRes = io.elevenlabs.ui.R.drawable.magic_book;
            this.iconResActive = io.elevenlabs.ui.R.drawable.magic_book_active;
        }

        public static /* synthetic */ Explore copy$default(Explore explore, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = explore.route;
            }
            return explore.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getRoute() {
            return this.route;
        }

        public final Explore copy(String route) {
            route.getClass();
            return new Explore(route);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Explore) && kotlin.jvm.internal.m.c(this.route, ((Explore) other).route)) {
                return true;
            }
            return false;
        }

        @Override // io.elevenlabs.readerapp.ui.screens.authenticated.BottomNavigationItem
        public String getAnalyticsLabel() {
            return this.analyticsLabel;
        }

        @Override // io.elevenlabs.readerapp.ui.screens.authenticated.BottomNavigationItem
        public int getIconRes() {
            return this.iconRes;
        }

        @Override // io.elevenlabs.readerapp.ui.screens.authenticated.BottomNavigationItem
        public int getIconResActive() {
            return this.iconResActive;
        }

        @Override // io.elevenlabs.readerapp.ui.screens.authenticated.BottomNavigationItem
        public String getRoute() {
            return this.route;
        }

        @Override // io.elevenlabs.readerapp.ui.screens.authenticated.BottomNavigationItem
        public int getTitleRes() {
            return this.titleRes;
        }

        public int hashCode() {
            return this.route.hashCode();
        }

        public String toString() {
            return defpackage.f.C("Explore(route=", this.route, Separators.RPAREN);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u000bHÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r¨\u0006\u001a"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/BottomNavigationItem$Home;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/BottomNavigationItem;", "route", "", "<init>", "(Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "analyticsLabel", "getAnalyticsLabel", "titleRes", "", "getTitleRes", "()I", "iconRes", "getIconRes", "iconResActive", "getIconResActive", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class Home extends BottomNavigationItem {
        public static final int $stable = 0;
        private final String analyticsLabel;
        private final int iconRes;
        private final int iconResActive;
        private final String route;
        private final int titleRes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Home(String str) {
            super(null);
            str.getClass();
            this.route = str;
            this.analyticsLabel = ShowkasePreviewGroup.HOME;
            this.titleRes = R.string.home_home;
            this.iconRes = io.elevenlabs.ui.R.drawable.home;
            this.iconResActive = io.elevenlabs.ui.R.drawable.home_active;
        }

        public static /* synthetic */ Home copy$default(Home home, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = home.route;
            }
            return home.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getRoute() {
            return this.route;
        }

        public final Home copy(String route) {
            route.getClass();
            return new Home(route);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Home) && kotlin.jvm.internal.m.c(this.route, ((Home) other).route)) {
                return true;
            }
            return false;
        }

        @Override // io.elevenlabs.readerapp.ui.screens.authenticated.BottomNavigationItem
        public String getAnalyticsLabel() {
            return this.analyticsLabel;
        }

        @Override // io.elevenlabs.readerapp.ui.screens.authenticated.BottomNavigationItem
        public int getIconRes() {
            return this.iconRes;
        }

        @Override // io.elevenlabs.readerapp.ui.screens.authenticated.BottomNavigationItem
        public int getIconResActive() {
            return this.iconResActive;
        }

        @Override // io.elevenlabs.readerapp.ui.screens.authenticated.BottomNavigationItem
        public String getRoute() {
            return this.route;
        }

        @Override // io.elevenlabs.readerapp.ui.screens.authenticated.BottomNavigationItem
        public int getTitleRes() {
            return this.titleRes;
        }

        public int hashCode() {
            return this.route.hashCode();
        }

        public String toString() {
            return defpackage.f.C("Home(route=", this.route, Separators.RPAREN);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u000bHÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r¨\u0006\u001a"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/BottomNavigationItem$Reads;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/BottomNavigationItem;", "route", "", "<init>", "(Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "analyticsLabel", "getAnalyticsLabel", "titleRes", "", "getTitleRes", "()I", "iconRes", "getIconRes", "iconResActive", "getIconResActive", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class Reads extends BottomNavigationItem {
        public static final int $stable = 0;
        private final String analyticsLabel;
        private final int iconRes;
        private final int iconResActive;
        private final String route;
        private final int titleRes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Reads(String str) {
            super(null);
            str.getClass();
            this.route = str;
            this.analyticsLabel = "library";
            this.titleRes = R.string.home_library;
            this.iconRes = io.elevenlabs.ui.R.drawable.headphones;
            this.iconResActive = io.elevenlabs.ui.R.drawable.headphones_active;
        }

        public static /* synthetic */ Reads copy$default(Reads reads, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = reads.route;
            }
            return reads.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getRoute() {
            return this.route;
        }

        public final Reads copy(String route) {
            route.getClass();
            return new Reads(route);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Reads) && kotlin.jvm.internal.m.c(this.route, ((Reads) other).route)) {
                return true;
            }
            return false;
        }

        @Override // io.elevenlabs.readerapp.ui.screens.authenticated.BottomNavigationItem
        public String getAnalyticsLabel() {
            return this.analyticsLabel;
        }

        @Override // io.elevenlabs.readerapp.ui.screens.authenticated.BottomNavigationItem
        public int getIconRes() {
            return this.iconRes;
        }

        @Override // io.elevenlabs.readerapp.ui.screens.authenticated.BottomNavigationItem
        public int getIconResActive() {
            return this.iconResActive;
        }

        @Override // io.elevenlabs.readerapp.ui.screens.authenticated.BottomNavigationItem
        public String getRoute() {
            return this.route;
        }

        @Override // io.elevenlabs.readerapp.ui.screens.authenticated.BottomNavigationItem
        public int getTitleRes() {
            return this.titleRes;
        }

        public int hashCode() {
            return this.route.hashCode();
        }

        public String toString() {
            return defpackage.f.C("Reads(route=", this.route, Separators.RPAREN);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u000bHÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r¨\u0006\u001a"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/BottomNavigationItem$Voices;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/BottomNavigationItem;", "route", "", "<init>", "(Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "analyticsLabel", "getAnalyticsLabel", "titleRes", "", "getTitleRes", "()I", "iconRes", "getIconRes", "iconResActive", "getIconResActive", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class Voices extends BottomNavigationItem {
        public static final int $stable = 0;
        private final String analyticsLabel;
        private final int iconRes;
        private final int iconResActive;
        private final String route;
        private final int titleRes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Voices(String str) {
            super(null);
            str.getClass();
            this.route = str;
            this.analyticsLabel = "voices";
            this.titleRes = R.string.home_voices;
            this.iconRes = io.elevenlabs.ui.R.drawable.voice_2;
            this.iconResActive = io.elevenlabs.ui.R.drawable.voice_2_active;
        }

        public static /* synthetic */ Voices copy$default(Voices voices, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = voices.route;
            }
            return voices.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getRoute() {
            return this.route;
        }

        public final Voices copy(String route) {
            route.getClass();
            return new Voices(route);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Voices) && kotlin.jvm.internal.m.c(this.route, ((Voices) other).route)) {
                return true;
            }
            return false;
        }

        @Override // io.elevenlabs.readerapp.ui.screens.authenticated.BottomNavigationItem
        public String getAnalyticsLabel() {
            return this.analyticsLabel;
        }

        @Override // io.elevenlabs.readerapp.ui.screens.authenticated.BottomNavigationItem
        public int getIconRes() {
            return this.iconRes;
        }

        @Override // io.elevenlabs.readerapp.ui.screens.authenticated.BottomNavigationItem
        public int getIconResActive() {
            return this.iconResActive;
        }

        @Override // io.elevenlabs.readerapp.ui.screens.authenticated.BottomNavigationItem
        public String getRoute() {
            return this.route;
        }

        @Override // io.elevenlabs.readerapp.ui.screens.authenticated.BottomNavigationItem
        public int getTitleRes() {
            return this.titleRes;
        }

        public int hashCode() {
            return this.route.hashCode();
        }

        public String toString() {
            return defpackage.f.C("Voices(route=", this.route, Separators.RPAREN);
        }
    }

    public /* synthetic */ BottomNavigationItem(kotlin.jvm.internal.f fVar) {
        this();
    }

    public abstract String getAnalyticsLabel();

    public abstract int getIconRes();

    public abstract int getIconResActive();

    public abstract String getRoute();

    public abstract int getTitleRes();

    private BottomNavigationItem() {
    }
}
