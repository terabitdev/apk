package io.elevenlabs.readerapp;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.c0;
import androidx.lifecycle.m1;
import com.google.protobuf.c6;
import java.util.Map;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public abstract class Hilt_MainActivity extends c0 implements tl.b {
    private volatile ql.b componentManager;
    private final Object componentManagerLock;
    private boolean injected;

    public Hilt_MainActivity() {
        this.componentManagerLock = new Object();
        this.injected = false;
        _initHiltInternal();
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new l.b() { // from class: io.elevenlabs.readerapp.Hilt_MainActivity.1
            @Override // l.b
            public void onContextAvailable(Context context) {
                Hilt_MainActivity.this.inject();
            }
        });
    }

    private void initSavedStateHandleHolders() {
        ql.b m1005componentManager = m1005componentManager();
        ql.f fVar = m1005componentManager.f28616d;
        ql.i iVar = ((ql.d) ql.f.a(fVar.f28620a, fVar.f28621b).a(e0.f20562a.b(ql.d.class))).f28619b;
        m1005componentManager.f28617e = iVar;
        if (iVar.f28627a == null) {
            q7.c defaultViewModelCreationExtras = m1005componentManager.f28615c.getDefaultViewModelCreationExtras();
            if (iVar.f28628b) {
                iVar.f28627a = defaultViewModelCreationExtras;
            } else {
                c6.x("setExtras should only be called for an Activity that extends ComponentActivity");
            }
        }
    }

    /* renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final ql.b m1005componentManager() {
        if (this.componentManager == null) {
            synchronized (this.componentManagerLock) {
                try {
                    if (this.componentManager == null) {
                        this.componentManager = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.componentManager;
    }

    public ql.b createComponentManager() {
        return new ql.b(this);
    }

    @Override // tl.b
    public final Object generatedComponent() {
        return m1005componentManager().generatedComponent();
    }

    @Override // i.m, androidx.lifecycle.o
    public m1 getDefaultViewModelProviderFactory() {
        m1 defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        pl.b hiltInternalFactoryFactory = ((pl.a) tb.a.t(pl.a.class, this)).getHiltInternalFactoryFactory();
        Map map = hiltInternalFactoryFactory.f26701a;
        defaultViewModelProviderFactory.getClass();
        return new pl.f(map, defaultViewModelProviderFactory, hiltInternalFactoryFactory.f26702b);
    }

    public void inject() {
        if (!this.injected) {
            this.injected = true;
            ((MainActivity_GeneratedInjector) generatedComponent()).injectMainActivity((MainActivity) this);
        }
    }

    @Override // androidx.fragment.app.c0, i.m, y5.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initSavedStateHandleHolders();
    }

    @Override // androidx.fragment.app.c0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ql.i iVar = m1005componentManager().f28617e;
        if (iVar != null) {
            iVar.f28627a = null;
        }
    }

    public Hilt_MainActivity(int i10) {
        super(i10);
        this.componentManagerLock = new Object();
        this.injected = false;
        _initHiltInternal();
    }
}
