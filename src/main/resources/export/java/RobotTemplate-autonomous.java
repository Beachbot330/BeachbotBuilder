#foreach( $component in $components )
#if ($component.getBase().getType() == "Command"
     && $component.getProperty("Add to SendableChooser").getValue())
        autoChooser.addObject("$component.getName()", new #class($component.getName())());
#end
#end

#set($autonomous = $robot.getProperty("Default Autonomous Command").getValue())
#if($autonomous != "None")        autoChooser.addDefault("$autonomous", new #class($autonomous)());
#end
