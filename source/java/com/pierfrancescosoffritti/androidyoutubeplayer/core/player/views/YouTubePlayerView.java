package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.ConnectivityManager;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import g4.a;
import j4.b;
import java.util.ArrayList;
import k3.v;
import l4.c;
import l4.d;
import l4.f;
import l4.g;
import l4.h;
import l4.i;
import l4.j;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class YouTubePlayerView extends d implements LifecycleEventObserver {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4373a;

    /* renamed from: b, reason: collision with root package name */
    public final c f4374b;
    public boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YouTubePlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.f4373a = new ArrayList();
        c cVar = new c(context, new i(this, 0));
        this.f4374b = cVar;
        addView(cVar, new FrameLayout.LayoutParams(-1, -1));
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, a.f5337a, 0, 0);
        obtainStyledAttributes.getClass();
        this.l = obtainStyledAttributes.getBoolean(1, true);
        boolean z10 = obtainStyledAttributes.getBoolean(0, false);
        boolean z11 = obtainStyledAttributes.getBoolean(2, true);
        String string = obtainStyledAttributes.getString(3);
        obtainStyledAttributes.recycle();
        if (z10 && string == null) {
            b.d.j("YouTubePlayerView: videoId is not set but autoPlay is set to true. This combination is not allowed.");
            throw null;
        }
        j jVar = new j(string, this, z10);
        if (this.l) {
            j4.a aVar = new j4.a(context);
            aVar.b(1, "controls");
            cVar.a(jVar, z11, new b(aVar.f7030a), string);
        }
    }

    public final void a(i4.a aVar, b bVar) {
        if (!this.l) {
            c cVar = this.f4374b;
            cVar.getClass();
            cVar.a(aVar, true, bVar, null);
            return;
        }
        b.d.j("YouTubePlayerView: If you want to initialize this view manually, you need to set 'enableAutomaticInitialization' to false.");
    }

    public final void b() {
        c cVar = this.f4374b;
        f fVar = cVar.f7713a;
        k4.d dVar = cVar.f7714b;
        Context context = dVar.f7276a;
        if (Build.VERSION.SDK_INT >= 24) {
            k4.c cVar2 = dVar.f7279d;
            if (cVar2 != null) {
                Object systemService = context.getSystemService("connectivity");
                systemService.getClass();
                ((ConnectivityManager) systemService).unregisterNetworkCallback(cVar2);
                dVar.f7277b.clear();
                dVar.f7279d = null;
                dVar.f7278c = null;
            }
        } else {
            v vVar = dVar.f7278c;
            if (vVar != null) {
                try {
                    context.unregisterReceiver(vVar);
                } catch (Throwable unused) {
                }
                dVar.f7277b.clear();
                dVar.f7279d = null;
                dVar.f7278c = null;
            }
        }
        cVar.removeView(fVar);
        fVar.removeAllViews();
        fVar.destroy();
    }

    public final boolean getEnableAutomaticInitialization() {
        return this.l;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        lifecycleOwner.getClass();
        event.getClass();
        int i = h.f7724a[event.ordinal()];
        c cVar = this.f4374b;
        switch (i) {
            case 1:
                cVar.l.f7280a = true;
                cVar.p = true;
                return;
            case 2:
                ((g) cVar.f7713a.getYoutubePlayer$core_release()).e();
                cVar.l.f7280a = false;
                cVar.p = false;
                return;
            case 3:
                b();
                return;
            case 4:
            case 5:
            case 6:
            case 7:
                return;
            default:
                o2.a.b();
                return;
        }
    }

    public final void setCustomPlayerUi(View view) {
        view.getClass();
        this.f4374b.setCustomPlayerUi(view);
    }

    public final void setEnableAutomaticInitialization(boolean z10) {
        this.l = z10;
    }

    public /* synthetic */ YouTubePlayerView(Context context, AttributeSet attributeSet, int i, int i3, kotlin.jvm.internal.h hVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YouTubePlayerView(Context context) {
        this(context, null, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YouTubePlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    public /* synthetic */ YouTubePlayerView(Context context, AttributeSet attributeSet, int i, kotlin.jvm.internal.h hVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
